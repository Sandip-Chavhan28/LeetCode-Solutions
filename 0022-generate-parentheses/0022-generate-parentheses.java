class Solution {
    List<String>list = new ArrayList<>();
    public void generate(int open,int close,StringBuilder sd,int n){
        if(open == n && close == n){
            list.add(sd.toString());
            return;
        }
        if(open < n){
            generate(open+1,close,sd.append('('),n);
            sd.deleteCharAt(sd.length()-1);
        }
        if(close<open){
            generate(open,close+1,sd.append(')'),n);
            sd.deleteCharAt(sd.length()-1);
        }

    }
    public List<String> generateParenthesis(int n) {
        StringBuilder sd = new StringBuilder();
        generate(0,0,sd,n);
        return list;
    }
}