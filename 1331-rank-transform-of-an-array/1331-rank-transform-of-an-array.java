class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int rank = 1;
        int ans[] = new int[n];
        for(int i= 0 ; i<n ; i++) {
            ans[i] = arr[i];
        }
        Arrays.sort(ans);

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i=0 ; i<n ; i++){
            if(!map.containsKey(ans[i])){
                map.put(ans[i],rank++);
            }
        }

        for(int i = 0 ; i<n ; i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}