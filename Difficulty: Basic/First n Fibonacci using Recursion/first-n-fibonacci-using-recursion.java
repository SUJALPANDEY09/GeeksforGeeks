class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static void fibo(int[] arr,int i){
        if (i == arr.length)
        return;

    if (i == 0){
        arr[i] = 0;}
    else if (i == 1){
        arr[i] = 1;}
    else{
        arr[i] = arr[i - 1] + arr[i - 2];
    }    
        fibo(arr,i+1);
    }
    
    
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int[] arr = new int[n];
        
        fibo(arr,0);
        return arr;
    }
}