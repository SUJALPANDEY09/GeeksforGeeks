class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int r =0;
        int l = arr.length -1;
        
        while(r<=l){
            int mid = (r+l)/2;
            
            if(arr[mid] == k) return true;
            
            if(arr[mid]<k){
                r = mid+1;
            }
            else{
                l = mid -1;
            }
        }
        return false;
    }
}