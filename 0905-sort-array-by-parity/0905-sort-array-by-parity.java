class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0 ;
        int end = nums.length-1;
        while(start < end){
            while(end > start && nums[end]%2 != 0){
                end--;
            }

            while(start < end && nums[start]%2 == 0){
                start++;
            }

            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
        return nums;
    }
}