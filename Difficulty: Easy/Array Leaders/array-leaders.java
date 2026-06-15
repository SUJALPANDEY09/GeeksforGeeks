class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[arr.length-1]);
        int right = arr[arr.length-1];
        for(int i =arr.length-2;i>=0;i--){
            if(arr[i]>=right){
                list.add(arr[i]);
                right = arr[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}
