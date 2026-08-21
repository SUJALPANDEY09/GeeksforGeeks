class Solution {
    public int reverseDigits(int n) {
        // Code here
        int sum =0;
        while(n!= 0){
            int digit = n%10;
            sum = (sum*10) + digit;
            n = n/10;
        }
        return sum;
    }
}