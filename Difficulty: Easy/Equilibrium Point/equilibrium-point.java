class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int sum =0,r =0,l=0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        
        for(int i =0;i<arr.length;i++){
            r = sum-l;
            l += arr[i];
            if(r==l){
                return i;
            }
        }
        return -1;
    }
}
