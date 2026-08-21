class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();

        list1.add(nums[0]);
        list2.add(nums[1]);
        int i= 2;

        while(i<nums.length){
            if(list1.get(list1.size()-1) > list2.get(list2.size()-1)){
                list1.add(nums[i]);
            }else{
                list2.add(nums[i]);
            }
            i++;
        }
        int index=0;
        for(i=0 ; i<list1.size() ;i++){
            nums[index++] = list1.get(i);
        }

        for(i=0 ; i<list2.size() ;i++){
            nums[index++] = list2.get(i);
        }
        return nums;

    }
}