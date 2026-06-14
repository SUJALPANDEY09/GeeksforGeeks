class Solution {
    public int minJumps(int[] arr) {
        if(arr[0] == 0)return -1;
        int r = 0;
        int l = 0;
        int jumps = 0;
        while(r<arr.length-1){
            int far =0; 
            for(int i =l;i<=r;i++){
               far = Math.max(far,i+arr[i]);
            }
            if(far<r){
                return -1;
            }
            l = r+1;
            r = far;
            jumps += 1;
        }
        return jumps;
    }
}