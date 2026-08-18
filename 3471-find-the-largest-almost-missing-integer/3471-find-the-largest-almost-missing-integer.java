class Solution {
    public int largestInteger(int[] nums, int k) {

    HashMap<Integer,Integer>map = new HashMap<>();
    int start = 0 ; 
    while(k <= nums.length){
        HashMap<Integer,Integer>tempmap = new HashMap<>();
        for(int i=start ; i<k ;i++){
            tempmap.put(nums[i],1);
        }

        for(int key : tempmap.keySet()){
            map.put(key,map.getOrDefault(key,0)+1);
        }
        start++;
        k++;
        
    }
    int max = -1;
    for(int key : map.keySet()){
        if(map.get(key)==1){
            max = Math.max(max,key);
        }
    }
    return max;
    //     if(k==nums.length || k==1)
    //     {
    //         return  maximum(nums);
    //     }
 
    //     int num1=nums[0];
    //     int num2=nums[nums.length-1];

    //     boolean first=false;
    //     boolean second=false;
    //     for(int i=1;i<nums.length-1;i++)
    //     {
    //         if(num1==nums[i])
    //         {
    //             first=true;
    //         }
    //         if(num2==nums[i])
    //         {
    //             second=true;
    //         }
    //     }

    //     if((num1==num2) || (first && second))
    //     {
    //         return -1;
    //     }
    //     else if(first)
    //     {
    //         return num2;
    //     }
    //     else if(second)
    //     {
    //         return num1;
    //     }

    //     return Math.max(num1,num2);

    // }

    // public int maximum(int nums[])
    // {
    //     int max=-1;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         max=Math.max(nums[i],max);
    //     }
    //     return max;
    }
}