class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int arr[][] = new int[n][3];
        for(int i=0 ; i<n; i++){
            int temp = nums[i];
            int sum = 0;
            while(temp>0){
                int r = temp % 10 ;
                sum += r;
                temp /= 10;
            }
            arr[i][0] = sum;
            arr[i][1] = nums[i];
            arr[i][2] = i;
        }

        int swap = 0 ;

        Arrays.sort(arr,(a,b) -> {
            if(a[0] != b[0]){
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[1],b[1]);
        });
        boolean visited[] = new boolean[n];

        for(int i=0 ; i<n ;i++){
            if(visited[i] || arr[i][2] == i){
                continue;
            }
            int cyclesize = 0;
            int j = i;

            while(!visited[j]){
                visited[j] = true;
                j = arr[j][2];
                cyclesize++;
            }

            swap  += (cyclesize - 1) ;
        }
        return swap;
    }
}