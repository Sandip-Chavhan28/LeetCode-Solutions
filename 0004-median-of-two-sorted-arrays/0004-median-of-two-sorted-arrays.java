class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ind1 = 0;
        int ind2 = 0;
        int index = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1+n2 ;
        int arr[] = new int[n];
        
        while(ind1<n1 && ind2<n2){
            if(nums1[ind1]<=nums2[ind2]){
                arr[index++] = nums1[ind1++] ;
            }else{
                arr[index++] = nums2[ind2++] ;
            }
        }
        while(ind1<nums1.length){
            arr[index++] = nums1[ind1++] ;
        }

        while(ind2<nums2.length){
            arr[index++] = nums2[ind2++] ;
        }
        if(arr.length == 1){
            return arr[0];
        }
        if(n %2 == 0){
            return (double)(arr[(n/2)-1]+arr[n/2])/2.0;
        }else{
            return (arr[n/2]);
        }  
    }
}