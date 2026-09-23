class Solution {
    public int climbStairs(int n) {
        if(n <= 1)  return 1;
        int dp[] = new int[n+1];
        int prev1 = 1 ; // this is a also one way not zero ways
        int prev2 = 1 ;
        for(int i=2 ; i<n+1 ; i++){
            int curr = prev1+prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        return prev2;
    }
}