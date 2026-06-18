class Solution {
    int majorityElement(int arr[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int val = -1;
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
                
        for(int j : map.keySet()){
            if(map.get(j)>arr.length/2){
                return j;
            }
        }
        return val;
    }
}