class Solution {
    public int addDigits(int num) {
        // int temp  = num;
        // while(temp > 9){
        //     int sum = 0;
        //     int temp2 = temp;
        //     while(temp2 > 0){
        //         int r = temp2 % 10;
        //         sum += r;
        //         temp2 /= 10;
        //     }
        //     temp = sum;
        // }
        // return temp;

        if (num == 0)
            return 0;
        if (num % 9 == 0)
            return 9;
        return num % 9;
    }
}