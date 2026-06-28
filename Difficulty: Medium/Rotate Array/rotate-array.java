class Solution {
    static void rotateArr(int arr[], int d) {
        // code here
        d = d%arr.length;
        
        int[] temp = new int[d];
        
        for(int i =0 ; i<d ;i++){
            temp[i] = arr[i];
        }
        
        for(int j = d ;j<arr.length;j++){
            arr[j-d] = arr[j];
        }
        
        for(int k = 0 ; k<d;k++){
            arr[(arr.length - d)+ k] = temp[k];
        }
    }
}