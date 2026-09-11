class Solution {
    int count = 0;

    public void generatethreedigit(int digits[],ArrayList<Integer>list,boolean visit[]){
        if(list.size() == 3){
            if(list.get(0) != 0 && list.get(list.size()-1) % 2 == 0){
                count++;
                return;
            }
        }

        for(int i=0 ; i<digits.length ;i++){
            if(visit[i]){
                continue;
            }

            if(i > 0 && digits[i] == digits[i-1] && !visit[i-1]){
                continue;
            }

            visit[i] = true;
            list.add(digits[i]);
            generatethreedigit(digits,list,visit);
            list.remove(list.size()-1);
            visit[i] =false;
        }
    }
    public int totalNumbers(int[] digits) {
        Arrays.sort(digits);
        boolean visit[] = new boolean[digits.length];
        ArrayList<Integer>list = new ArrayList<>();
        generatethreedigit(digits,list,visit);
        return count;
    }
}