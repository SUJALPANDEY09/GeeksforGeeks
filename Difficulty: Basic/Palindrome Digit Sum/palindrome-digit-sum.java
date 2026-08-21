class Solution {
    private boolean isReverse(int n){
            int n1 = n;
            int reverse = 0;
            while(n1 != 0){
                int digits = n1%10;
                reverse = (reverse * 10) + digits;
                n1 = n1/10;
            }
            
            if(n == reverse){
                return true;
            }
            return false;
        }
    boolean isDigitSumPalindrome(int n) {
        // code here\
        int num = n;
        int sum =0;
        while(num != 0){
            int digit = num % 10;
            sum += digit;
            num = num/10;
        }
        return isReverse(sum);
    }
}