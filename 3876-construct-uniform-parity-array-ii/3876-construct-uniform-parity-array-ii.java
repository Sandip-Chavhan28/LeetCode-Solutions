class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        boolean iseven = true;
        if(nums1[0] %2 != 0){
            iseven =false;
        }

        if(iseven){
            for(int i=0 ; i<nums1.length; i++){
                boolean isfound = false;
                if(nums1[i] %2 != 0){
                    for(int j = i-1 ; j>=0 ; j--){
                        if(nums1[i]-nums1[j]%2 == 0){
                            isfound = true;
                            break;
                        }
                    }
                    if(!isfound){
                        return false;
                    }
                }
            }
        }else{
            for(int i=0 ; i<nums1.length; i++){
                boolean isfound = false;
                if(nums1[i] %2 == 0){
                    for(int j = i-1 ; j>=0 ; j--){
                        if(nums1[i]-nums1[j]%2 != 0){
                            isfound = true;
                            break;
                        }
                    }
                    if(!isfound){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}