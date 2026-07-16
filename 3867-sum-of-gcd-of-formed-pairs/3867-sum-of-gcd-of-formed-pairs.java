class Solution {
    public int gcd(int a,int b){
        while(b>0){
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n= nums.length;
        int max = 0;

        for(int i=0 ; i<n ; i++){
            if(max < nums[i]){
                max = nums[i];
            }
            nums[i] = gcd(nums[i],max);
        }
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        long sum = 0;
        while(start<end){
            sum += gcd(nums[start++],nums[end--]);
        }
        return sum;
    }
}