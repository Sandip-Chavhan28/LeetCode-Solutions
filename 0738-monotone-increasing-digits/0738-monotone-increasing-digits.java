class Solution {
    public void reverse(ArrayList<Integer>list){
        int start = 0;
        int end = list.size()-1;
        while(start<end){
            int temp = list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
    }
    public int monotoneIncreasingDigits(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(n>0){
            int r = n%10;
            list.add(r);
            n /= 10;
        }
        reverse(list);

        int i = list.size()-1;
        int mark = list.size();

        while(i>0){
            if(list.get(i-1) > list.get(i)){
                list.set(i-1,list.get(i-1)-1);
                mark = i;
            }
            i--;
        }
       

        for(int j = mark ; j<list.size() ;j++){
            list.set(j,9);
        }
        int number = 0;

        for(int l=0 ; l<list.size() ;l++){
            number = number * 10 + list.get(l);
        }
        return number;
    }
}