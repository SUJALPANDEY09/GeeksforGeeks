class Solution {
    public static int GCD(int a,int b){
        while(b!=0){
            int rem = a%b;
            a =b;
            b = rem;
        }
        return a;
    }
    public static int LCM(int a,int b){
        int lcm = (a/GCD(a,b))*b;
        return lcm;
    }
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int[] arr = new int[2];
        arr[0] = LCM(a,b);
        arr[1] = GCD(a,b);
        
        return arr;
    }
}