class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>map = new HashMap<>();
        String arr[] = s.split("\\s+");
        HashSet<String> set = new HashSet<>();

        if(pattern.length() != arr.length){
            return false;
        }

        for(int i=0 ; i<arr.length; i++){
            char ch = pattern.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,arr[i]);
            }else{
                if(!map.get(ch).equals(arr[i])){
                    return false;
                }
            }
            set.add(map.get(ch));
        }

        if(set.size() != map.size()){
            return false;
        }
        return true;
        
    }
}