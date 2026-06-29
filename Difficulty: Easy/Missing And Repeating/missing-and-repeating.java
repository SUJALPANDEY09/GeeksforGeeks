class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int r : arr){
            map.put(r,map.getOrDefault(r,0)+1);
        }
        
        int missing = -1;
        int duplicate = -1;
        
        for(int i = 1;i<=arr.length;i++){
            if(!map.containsKey(i)){
                missing = i;
            }
            else if(map.get(i) == 2){
                duplicate = i;
            }
        }
        list.add(duplicate);
        list.add(missing);
        
        return list;
    }
}
