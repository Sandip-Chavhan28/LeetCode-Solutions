class Solution {
    public int missingInteger(int[] nums) {
        int end = nums.length-1;
        for(int i=1 ; i<nums.length; i++){
            if(nums[i]-nums[i-1] != 1){
                end = i-1;
                break;
            }
        }
        int sum = 0;
        for(int i=0 ; i<=end ;i++){
            sum += nums[i];
        }
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length; i++){
            if(nums[i] == sum){
                sum++;
            }
        }
        return sum;
    }
}