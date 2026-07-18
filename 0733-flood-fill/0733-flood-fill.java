class Solution {

    public void dfs(int[][] image, int sr, int sc,int original,int color){
        if(sr == image.length || sc== image[0].length || sr < 0 || sc < 0){
            return;
        }
        if(image[sr][sc] != original){
            return;
        }
        image[sr][sc] = color;
        dfs(image, sr + 1, sc, original, color);
        dfs(image, sr - 1, sc, original, color);
        dfs(image, sr, sc + 1, original, color);
        dfs(image, sr, sc - 1, original, color);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];

        if (original == color) {
            return image;
        }
        
        dfs(image,sr,sc,original,color);
        return image;
    }
}