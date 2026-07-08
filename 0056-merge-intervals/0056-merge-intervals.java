import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        
        // Step 1: Sort based on start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        ArrayList<int[]> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            
            // If list is empty OR no overlap
            if(list.isEmpty() || start > list.get(list.size()-1)[1]){
                list.add(new int[]{start, end});
            } 
            else {
                // Merge
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1], end);
            }
        }
        
        return list.toArray(new int[list.size()][]);
    }
}