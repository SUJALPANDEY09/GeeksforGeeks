class Solution {
    static int closestNumber(int n, int m) {
        // code here
        m = Math.abs(m);
        int q = n/m;
        
        int lower = q * m;
        
        int upper;
        
        if(n>= 0){
            upper = (q+1) * m;
        }
        else{
            upper = (q -1) * m;
        }
        
        if(Math.abs(upper - n)> Math.abs(lower - n)){
            return lower;
        }
        else{
            return upper;
        }
    }
}