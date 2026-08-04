class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>list = new ArrayList<>();
        int min = 0;
        int max = 0;
        for(int i=1 ; i<nums.length ;i++){
            if(nums[i]>nums[max]){
                max = i;
            }
            if(nums[i] < nums[min]){
                min = i;
            }
        }
        int freq[] = new int[nums[max]+1];
        for(int i=0 ; i<nums.length ; i++){
            freq[nums[i]]++;
        }
        for(int i = nums[min] ; i<freq.length ;i++){
            if(freq[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}