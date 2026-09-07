class Solution {
    static long kthDigit(int a, int b, int k) {
        // code here
        long ans = 1;
        
        for(int i =0;i<b;i++){
            ans *= a;
        }
        
        int digit = 0;
        
        for(int i =0;i<k-1;i++){
            ans /= 10;
        }
        return ans%10;
    }
}