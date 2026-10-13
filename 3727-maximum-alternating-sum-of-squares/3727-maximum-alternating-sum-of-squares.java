class Solution {
    public long maxAlternatingSum(int[] nums) {
        long score = 0;

        for(int i=0 ; i<nums.length; i++){
            if(nums[i] < 0){
                nums[i] = -(nums[i]);
            }
        }

        Arrays.sort(nums);

        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            if(start == end){
                score += nums[start]*nums[start];
            }else{
                score += nums[end]*nums[end];
                score -= nums[start]*nums[start];
            }
            start++;
            end--;
        }

        return score;
    }
}