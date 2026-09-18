class Solution {

    public void reverse(String arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public String reverseWords(String s) {
        String arr[] = s.trim().split("\\s+");
        reverse(arr);
        StringBuilder sd = new StringBuilder();
        for(int i=0 ; i<arr.length ; i++){
            sd.append(arr[i]);
            sd.append(" ");
        }
        sd.deleteCharAt(sd.length()-1);
        return sd.toString();
    }
}