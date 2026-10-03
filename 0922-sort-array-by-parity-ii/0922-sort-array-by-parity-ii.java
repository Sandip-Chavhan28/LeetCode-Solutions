class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0;
        int j=1;
        int temp[] = new int[nums.length];

        for(int k=0 ; k<nums.length; k++){
            if(nums[k]%2 == 0){
                temp[i] = nums[k];
                i+=2;
            }else{
                temp[j] = nums[k];
                j+= 2;
            }
        }
        return temp;
    }
}