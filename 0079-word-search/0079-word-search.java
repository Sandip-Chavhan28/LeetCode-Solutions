class Solution {
    public boolean path(int i,int j,char[][] board,String word,int index,boolean visit[][]){
        if(index == word.length()){
            return true;
        }
        if(i<0 || j<0 || i==board.length || j == board[0].length){
            return false;
        }

        if(board[i][j] != word.charAt(index)){
            return false;
        }
        if(visit[i][j]){
            return false;
        }
        visit[i][j] = true;

        if(path(i+1,j,board,word,index+1,visit) || path(i,j+1,board,word,index+1,visit) || path(i-1,j,board,word,index+1,visit) || path(i,j-1,board,word,index+1,visit)){
            return true;
        }

        visit[i][j] =false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m = board[0].length;
        boolean flag = false;
        for(int i=0 ; i<board.length ; i++){
            boolean visit[][] = new boolean[n][m];
            for(int j=0 ; j<board[0].length ; j++){
                if(board[i][j] == word.charAt(0)){
                    if(path(i,j,board,word,0,visit)){
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
}