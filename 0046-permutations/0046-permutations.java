class Solution {
    public void generate(int[] nums,boolean visit[],List<Integer>list,List<List<Integer>>finallist){
        if(list.size()== nums.length){
            finallist.add(new ArrayList<>(list));
            return;
        }

        for(int i=0 ; i<nums.length;i++){
            if(!visit[i]){
                visit[i] = true;
                list.add(nums[i]);
                generate(nums,visit,list,finallist);
                visit[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean visit[] = new boolean[nums.length];
        List<Integer>list = new ArrayList<>();
        List<List<Integer>>finallist = new ArrayList<>();
        generate(nums,visit,list,finallist);
        return finallist;
    }
}