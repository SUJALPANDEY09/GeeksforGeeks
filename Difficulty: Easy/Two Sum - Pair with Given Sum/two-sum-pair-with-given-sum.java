class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        if(arr.length == 1) return false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length; i++){
            if(map.containsKey(target - arr[i])){
                return true;
            }
            map.put(arr[i],arr[i]);
        }
        return false;
    }
}