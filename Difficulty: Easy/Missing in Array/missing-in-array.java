class Solution {
    int missingNum(int arr[]) {
        int total =0;
        int sum =0;
        for (int i = 1;i<=arr.length+1;i++){
            sum ^= i;
        }
        for(int i = 0;i<arr.length; i++){
            total ^= arr[i];
        }
        return sum ^ total;
    }
}