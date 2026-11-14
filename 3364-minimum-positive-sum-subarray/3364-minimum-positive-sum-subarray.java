class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minsum = Integer.MAX_VALUE;
        int n = nums.size();

        for(int i=0 ; i<n ;i++){
            int sum = 0 ;
            for(int k=i ; k<n ;k++){
                int length = k-i+1;
                sum += nums.get(k);
                System.out.println(sum);

                if(length >= l && length <= r){

                    if(sum > 0){
                        minsum = Math.min(minsum,sum);
                    }
                }
            }
        }

        if(minsum == Integer.MAX_VALUE){
            return -1;
        }
        return minsum;
    }
}