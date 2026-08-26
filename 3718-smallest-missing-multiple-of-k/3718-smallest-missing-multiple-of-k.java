class Solution {
    public int missingMultiple(int[] nums, int k) {
        int min = -1;
        HashSet<Integer>set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int multiple = k;
        while(true){
            if(!set.contains(k)){
                min = k;
                break;
            }
            System.out.println(k);
            k+= multiple;
        }
        return min;
    }
}