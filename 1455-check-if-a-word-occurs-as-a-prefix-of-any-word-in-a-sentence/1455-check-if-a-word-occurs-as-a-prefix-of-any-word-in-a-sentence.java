class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String arr[] = sentence.split("\\s+");
        int index = 0;
        for(int i=0 ; i<arr.length; i++){
            while(index < arr[i].length() && index < searchWord.length() && arr[i].charAt(index) == searchWord.charAt(index)){
                index++;   
            }
            if(index == searchWord.length()){
                return i+1;
            }
        }
        return -1;
    }
}