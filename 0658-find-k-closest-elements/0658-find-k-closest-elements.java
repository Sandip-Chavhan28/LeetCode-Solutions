class Solution {

    class info implements Comparable<info>{
        int data;
        int diff;

        public info(int data,int diff){
            this.data = data;
            this.diff = diff;
        }
        @Override
        public int compareTo(info other){
            if(this.diff == other.diff){
                return this.data-other.data;
            }else{
                return this.diff-other.diff;
            }
            
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer>list = new ArrayList<>();
        PriorityQueue<info>pq = new PriorityQueue<>();

        for(int i=0 ; i<arr.length ;i++){
            pq.add(new info(arr[i],Math.abs(arr[i]-x)));
        }

        for(int i=0; i<k; i++){
            info curr = pq.remove();
            list.add(curr.data);
        }
        Collections.sort(list);
        return list;
    }
}