class Solution {
    public boolean path(int i,int j,char[][] board,String word,int index){
        if(index == word.length()){
            return true;
        }
        if(i<0 || j<0 || i==board.length || j == board[0].length){
            return false;
        }
        char temp = board[i][j];

        if(board[i][j] == '#'){
            return false;
        }

        if(board[i][j] != word.charAt(index)){
            return false;
        }
        
        board[i][j] = '#';

        boolean found = (path(i+1,j,board,word,index+1) || path(i,j+1,board,word,index+1) || path(i-1,j,board,word,index+1) || path(i,j-1,board,word,index+1));

        board[i][j] = temp;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0 ; i<board.length ; i++){
            for(int j=0 ; j<board[0].length ; j++){
                if(board[i][j] == word.charAt(0)){
                    if(path(i,j,board,word,0)){
                        return true;
                    }
                }
            }

        }
        return false;
    }
}