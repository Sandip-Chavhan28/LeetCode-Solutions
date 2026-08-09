class Solution {

    public void generate(int k,int n,List<Integer>list,List<List<Integer>>finallist,int sum,int start){
        if(k == 0){
            if(sum == n){
                finallist.add(new ArrayList<>(list));
            }
            return;
        }
        for(int i=start ; i<10 ; i++){
            list.add(i);
            generate(k-1,n,list,finallist,sum+i,i+1);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>finallist = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        generate(k,n,list,finallist,0,1);
        return finallist;
    }
}