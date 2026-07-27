class Solution {

    public boolean isSafe(char[][] board,int row ,int col,int digit){
        for(int i=0 ; i<9 ; i++){
            if(board[i][col] == (char)(digit + '0')){
                return false;
            }
        }

        for(int j=0 ; j<9 ; j++){
            if(board[row][j] == (char)(digit + '0')){
                return false;
            }
        }

        int srow = (row/3)*3;
        int scol = (col/3)*3;

        for(int i=srow ; i<srow+3 ; i++){
            for(int j=scol ; j<scol+3 ; j++){
                if(board[i][j] == (char)(digit + '0')){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean sudoku(char[][] board,int row ,int col){
        if(row ==9){
            return true;
        }
        int nextrow = row;
        int nextcol = col+1;

        if(nextcol == 9){
            nextrow++;
            nextcol = 0;
        }

        if(board[row][col] != '.'){
            return sudoku(board,nextrow,nextcol);
        }

        for(int digit= 1 ; digit<=9 ; digit++){
            if(isSafe(board,row,col,digit)){
                board[row][col] = (char)(digit + '0');
                if(sudoku(board,nextrow,nextcol)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;

    }


    public void solveSudoku(char[][] board) {
        sudoku(board,0,0);
    }
}