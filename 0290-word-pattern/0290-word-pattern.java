class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>map = new HashMap<>();
        String arr[] = s.split("\\s+");

        if(pattern.length() != arr.length){
            return false;
        }

        for(int i=0 ; i<arr.length; i++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(arr[i])){
                    return false;
                }
            }else if(map.containsValue(arr[i])){
                return false;
            }else{
                map.put(ch,arr[i]);
            }
        }
        return true;
        
    }
}