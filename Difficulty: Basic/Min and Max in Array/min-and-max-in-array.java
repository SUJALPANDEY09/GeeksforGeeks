class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> ans = new ArrayList<>();
        int max =arr[0],min =arr[0];
        for(int i =0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }
        ans.add(min);
        ans.add(max);
        return ans;
    }
}
