class Solution {
    public boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch == 'u') ;
    }
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int start = 0 ;
        int end = arr.length-1;
        
        while(start < end){
            while((start < end) && !isVowel(arr[start])){
                start++;
            }

            while((end > start) && !isVowel(arr[end])){
                end--;
            }

            if(start < end){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            start++;
            end--;
        }
        return new String(arr);
    }
}