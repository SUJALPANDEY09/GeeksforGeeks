class Solution {
    public int getSecondLargest(int[] arr) {
        int max = -1;
        int sec = -1;
        for(int i = 0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        for(int j = 0;j<arr.length;j++){
            if(arr[j]>sec && arr[j] != max){
                sec = arr[j];
            }
        }
        return sec;
    }
}