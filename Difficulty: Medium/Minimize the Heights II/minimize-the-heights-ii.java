class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        
        if(arr.length == 1) return 0;
        
        int ans = arr[arr.length -1] - arr[0];
        
        for(int i =0;i<arr.length-1;i++){
            
            if((arr[i+1] -k) <0) continue;
            
            int lowest =Math.min(arr[0]+k,arr[i+1] -k);           
            int highest =Math.max(arr[arr.length-1]-k,arr[i]+k);
            
            ans = Math.min(ans,highest-lowest);
        }
        return ans;
    }
}
