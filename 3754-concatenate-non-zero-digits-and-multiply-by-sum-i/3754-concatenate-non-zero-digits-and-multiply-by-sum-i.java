class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long nums = 0;
        while(n>0){
            int r = n%10 ;
            if(r != 0){
                nums = nums*10 + r;
                sum += r;
            }
            n = n/10;
        }
        n = 0;
        while(nums>0){
            int r = (int)nums%10 ;
            n = n*10 + r;
            nums = nums/10;
        }
        return (long)n*sum;
    }
}