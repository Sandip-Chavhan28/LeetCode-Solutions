class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n ;i<=n+10 ; i++){
            int temp = i;
            int product = 1;
            while(temp >0){
                int r = temp %10;
                product *= r;
                temp = temp /10;
            }
            if(product %t == 0){
                return i;
            }
        }
        return -1;
    }
}