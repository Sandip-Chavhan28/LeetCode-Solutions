class Solution {
    public long gcd(long a,long b){
        while(b>0){
            long temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n= nums.length;
        int mx[] = new int[n];
        int prefix[]= new int[n];

        int max = 0;

        for(int i=0 ; i<n ; i++){
            if(max < nums[i]){
                max = nums[i];
            }
            mx[i] = max;
            prefix[i] = (int)gcd(nums[i],mx[i]);
        }
        Arrays.sort(prefix);
        int start = 0;
        int end = prefix.length-1;
        long sum = 0;
        while(start<end){
            sum += gcd(prefix[start],prefix[end]);
            start++;
            end--;
        }
        return sum;
    }
}