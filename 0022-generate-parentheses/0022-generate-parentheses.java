class Solution {
    List<String>list = new ArrayList<>();
    public boolean check(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.pop() != '('){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
    public void generate(int n,String s){
        if(s.length()==n){
            if(check(s)){
                list.add(s);
            }
            return;
        }
        generate(n,s+"(");
        generate(n,s+")");
    }
    public List<String> generateParenthesis(int n) {
        String s = new String();
        generate(2*n,s);
        return list;
    }
}