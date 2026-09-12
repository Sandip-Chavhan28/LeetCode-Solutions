class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sd = new StringBuilder();
        int index = 0;
        if(spaces[index] == 0){
            sd.append(' ');
            index++;
        }
        for(int i=0 ; i<s.length() ;i++){
            sd.append(s.charAt(i));
            if((index) < spaces.length && (i+1) == spaces[index]){
                sd.append(' ');
                index++;
            }
        }
        return sd.toString();
    }
}