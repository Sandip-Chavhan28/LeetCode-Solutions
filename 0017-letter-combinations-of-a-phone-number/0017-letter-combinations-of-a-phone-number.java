class Solution {
    List<String>list = new ArrayList<>();
    public void generatecom(String digit,HashMap<Character,String>map){
        if(digit.length() == 1){
            String str = map.get(digit.charAt(0));
            for(int i=0 ; i<str.length();i++){
                String newstr = ""+str.charAt(i);
                list.add(newstr);
            }
        }else if(digit.length() == 2){
            String str = map.get(digit.charAt(0));
            String str2 = map.get(digit.charAt(1));
            for(int i=0 ; i<str.length();i++){
                for(int j=0; j<str2.length();j++){
                    String newstr = ""+str.charAt(i)+str2.charAt(j);
                    list.add(newstr);
                }
            }
        }else if(digit.length() == 3){
            String str = map.get(digit.charAt(0));
            String str2 = map.get(digit.charAt(1));
            String str3 = map.get(digit.charAt(2));
            for(int i=0 ; i<str.length();i++){
                for(int j=0; j<str2.length();j++){
                    for(int k=0 ; k<str3.length();k++){
                        String newstr = ""+str.charAt(i)+str2.charAt(j)+str3.charAt(k);
                        list.add(newstr);
                    }
                }
            }
        }else{
            String str = map.get(digit.charAt(0));
            String str2 = map.get(digit.charAt(1));
            String str3 = map.get(digit.charAt(2));
            String str4 = map.get(digit.charAt(3));
            for(int i=0 ; i<str.length();i++){
                for(int j=0; j<str2.length();j++){
                    for(int k=0 ; k<str3.length();k++){
                        for(int l=0 ; l<str4.length();l++){
                            String newstr = ""+str.charAt(i)+str2.charAt(j)+str3.charAt(k)+str4.charAt(l);
                            list.add(newstr);
                        }
                    }
                }
            } 
        }
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String>map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        generatecom(digits,map);
        return list;
    }
}