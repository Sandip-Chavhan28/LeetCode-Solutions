class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for(int i = 0 ; i<nums.length; i++){
            int curr = nums[i];
            int count = 0;
            while(i<nums.length && nums[i] == curr){
                count++;
                i++;
            }
            i--;
            if(count == 1){
                return curr;
            }
        }
        return -1;
    }
}