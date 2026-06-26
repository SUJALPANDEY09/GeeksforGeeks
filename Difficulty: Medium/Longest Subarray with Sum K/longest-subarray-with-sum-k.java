class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        long sum =0;
        int max = 0;
        HashMap<Long,Integer> map = new HashMap<>();
        
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
            if(sum == k){
                max =i+1;
            }
            long presum = sum -k;
            if(map.containsKey(presum)){
                max = Math.max(max,(i-(map.get(presum))));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return max; 
    }
}
