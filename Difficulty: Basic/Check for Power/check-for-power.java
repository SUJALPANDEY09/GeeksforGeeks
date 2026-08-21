class Solution {
    public boolean isPower(int x, int y) {
        // code here
        if(x == 1 && y == 1) return true;
        if(x == 1 && y != 1) return false;
        
        while(y > 1){
            if (y % x != 0) {
                return false;
            }
            y = y/x;
        }
        return y==1;
    }
}