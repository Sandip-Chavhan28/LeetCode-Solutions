class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int start = 0;
        int end = people.length-1;
        // boolean visit[] = new boolean[people.length];
        while(start <= end){
            if(start<end && (people[start] + people[end]) <= limit){
                count++;
                // visit[start] = true;
                // visit[end] = true;
                start++;
                end--;
            }else{
                count++;
                end--;
            }
        }
        // for(int i=start ;i<people.length;i++){
        //     if(!visit[i] && people[i]<= limit){
        //         count++;
        //     }
        // }
        return count;
    }
}