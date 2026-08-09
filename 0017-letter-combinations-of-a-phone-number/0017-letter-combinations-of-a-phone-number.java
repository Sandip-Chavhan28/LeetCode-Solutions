class Solution {
    List<String>list = new ArrayList<>();
    String lettes[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void generatecom(String digits,int index,StringBuilder sd){
        if(index == digits.length()){
            list.add(sd.toString());
            return;
        }

        String currstr = lettes[digits.charAt(index)-'0'];
        for(int i=0 ; i<currstr.length() ;i++){
            generatecom(digits,index+1,sd.append(currstr.charAt(i)));
            sd.deleteCharAt(sd.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        generatecom(digits,0,new StringBuilder());
        return list;
    }
}