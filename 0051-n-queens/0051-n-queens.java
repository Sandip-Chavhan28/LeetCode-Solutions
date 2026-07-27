class Solution {

    public boolean isSafe(char arr[][],int row,int col){
        //check vertically
        for(int i=row-1 ; i>=0 ; i--){
            if(arr[i][col] == 'Q'){
                return false;
            }
        }

        //digonaly left
        for(int i=row-1,j=col-1 ; i>=0 && j>=0 ; i--,j--){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }
        
        //check Digonaly right
        for(int i= row-1 , j=col+1 ; i>=0 && j<arr.length; i--,j++){
            if(arr[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public void nQueens(char arr[][],int row,List<List<String>>finallist){
        if(row == arr.length){
            List<String>list = new ArrayList<>();
            for(int i=0 ; i<arr.length ; i++){
                StringBuilder sd = new StringBuilder();
                for(int j=0 ; j<arr.length ; j++){
                    sd.append(arr[i][j]);
                }
                list.add(sd.toString());
            }
            finallist.add(new ArrayList<>(list));
            return ;
        }

        for(int j=0 ; j<arr.length; j++){
            if(isSafe(arr,row,j)){
                arr[row][j] = 'Q';
                nQueens(arr,row+1,finallist);
                arr[row][j] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>finallist = new ArrayList<>();
        char arr[][] = new char[n][n];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                arr[i][j] = '.';
            }
        }
        nQueens(arr,0,finallist);
        return finallist;
    }
}