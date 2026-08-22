class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int product = 1;
        while(temp>0){
            int r = temp %10;
            sum += r;
            product *=r;
            temp /= 10;
        }
        int total = product + sum;
        if(n % total == 0){
            return true;
        }
        return false;
    }
}