class Solution {
    public int thirdMax(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        HashSet<Integer>set = new HashSet<>();

        for(int i=0 ; i<nums.length; i++){
            set.add(nums[i]);
            if(nums[i] > max1){
                max3 = max2;
                max2 =max1;
                max1 = nums[i];
            }else if(nums[i]<max1 && max2 < nums[i]){
                max3 = max2;
                max2 = nums[i];
            }else if(nums[i]<max2 && max3<nums[i]){
                max3 = nums[i];
            }
        }
        if(set.size() <= 2){
            return max1;
        }
        return max3;
    }
}