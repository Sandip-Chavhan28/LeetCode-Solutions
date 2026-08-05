class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp = x;
        int rev = 0;
        while(temp>0){
            int r = temp % 10;
            rev = rev*10 +r;
            temp = temp / 10;
        }
        if(rev == x){
            return true;
        }
        return false;
    }
}