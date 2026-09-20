class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0 ; i<s.length() ; i++){
            char curr = s.charAt(i);
            int index = curr - 'a';
            int reverse = 26 - index;
            int product = reverse * (i+1);
            sum += product;
        }
        return sum;
    }
}