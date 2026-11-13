class Solution {
    public int maxDec(int arr[]){
        int count = 1;
        for(int i=0 ; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                count++;
            }else{
                break;
            }
        }
        return count;
    }

    public int maxIn(int arr[]){
        int count = 1;
        for(int i=0 ; i<arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
    public int longestMonotonicSubarray(int[] nums) {
        // int maxSID = 0;
        // int n = nums.length;

        // for(int i=0 ; i<n; i++){
        //     for(int j=i; j<n; j++){
        //         int arr[] = new int[j-i+1];
        //         int index = 0;
        //         for(int k=i ; k<=j ;k++){
        //             arr[index++] = nums[k];
        //         }
        //         int count1 = maxDec(arr);
        //         int count2 = maxIn(arr);
        //         maxSID = Math.max(maxSID,Math.max(count1,count2));
        //     }
        // }
        // return maxSID;

        int incre = 1 , dec = 1 , res = 1;
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i-1] < nums[i]){
                incre++;
                dec = 1;
            }else if(nums[i-1] > nums[i]){
                dec++;
                incre = 1;
            }else{
                incre = 1;
                dec = 1;
            }

            res = Math.max(res, Math.max(incre,dec));
        }
        return res;
    }
}