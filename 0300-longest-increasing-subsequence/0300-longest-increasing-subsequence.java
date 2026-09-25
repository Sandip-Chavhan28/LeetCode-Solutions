class Solution {

    public int LIS(int nums[],int temp[],int i,int j,int dp[][]){
        if(i == nums.length || j == temp.length){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(nums[i] == temp[j]){
            dp[i][j] =  1+LIS(nums,temp,i+1,j+1,dp);
        }else{
            int reduceone = LIS(nums,temp,i+1,j,dp);
            int reducesec = LIS(nums,temp,i,j+1,dp);

            dp[i][j] =  Math.max(reduceone,reducesec);
        }
        return dp[i][j];
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        HashSet<Integer>set = new HashSet<>();
        for(int i=0 ; i<nums.length; i++){
            set.add(nums[i]);
        }

        int temp[] = new int[set.size()];
        int index = 0;
        for(int val : set){
            temp[index++] = val;
        }
        int dp[][] = new int[n+1][set.size()+1];
        for(int i=0 ; i<n+1 ; i++){
            Arrays.fill(dp[i],-1);
        }
        Arrays.sort(temp);
        return LIS(nums,temp,0,0,dp);
    }
}