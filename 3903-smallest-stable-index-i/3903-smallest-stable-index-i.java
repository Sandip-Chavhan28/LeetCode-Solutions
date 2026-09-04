class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if(nums.length == 0){
            return -1;
        }
        // for(int i=0 ; i<nums.length; i++){
        //     int max = Integer.MIN_VALUE;
        //     for(int j=0 ; j<=i; j++){
        //         max = Math.max(nums[j],max);
        //     }
        //     int min = Integer.MAX_VALUE;
        //     for(int l=i; l<nums.length; l++){
        //         min = Math.min(nums[l],min);
        //     }
        //     System.out.println(min + " "+max);
        //     if((max-min) <=k){
        //         return i;
        //     }
        // }
        // return -1;
        int n = nums.length;
        int max[] = new int[n];
        int min[] = new int[n];

        max[0] = nums[0];
        for(int i=1 ; i<n; i++){
            max[i] = Math.max(max[i-1],nums[i]);
        }
        min[n-1] = nums[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            min[i] = Math.min(min[i+1],nums[i]);
        }

        for(int i=0 ; i<n ;i++){
            if(max[i]-min[i] <= k){
                return i;
            }
        }
        return -1;
    }
}