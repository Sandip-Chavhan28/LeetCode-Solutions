class Solution {
    public double averageWaitingTime(int[][] customers) {
        double total_waiting = 0;
        int currtime = customers[0][0];
        for(int i=0 ; i<customers.length; i++){
            if(currtime < customers[i][0]){
                currtime = customers[i][0];
            }
            currtime += customers[i][1];
            total_waiting += currtime - customers[i][0];
        }
        return total_waiting/customers.length;
    }
}