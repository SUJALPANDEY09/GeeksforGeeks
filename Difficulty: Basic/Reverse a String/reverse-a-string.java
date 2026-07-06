class Solution {
    public static String reverseString(String s) {
        // code here
        int r = s.length()-1;
        int l =0;
        StringBuilder ans = new StringBuilder(s);
        
        while(l<r){
             char temp = ans.charAt(l);

            ans.setCharAt(l, ans.charAt(r));
            ans.setCharAt(r, temp);

            l++;
            r--;
        }
        return ans.toString();
    }
}