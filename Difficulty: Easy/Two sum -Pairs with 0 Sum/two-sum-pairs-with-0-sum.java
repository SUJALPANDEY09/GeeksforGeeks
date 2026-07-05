class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {

            int sum = arr[l] + arr[r];

            if (sum == 0) {

                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[l]);
                pair.add(arr[r]);
                list.add(pair);

                l++;
                r--;

                
                while (l < r && arr[l] == arr[l - 1]) {
                    l++;
                }

                while (l < r && arr[r] == arr[r + 1]) {
                    r--;
                }

            } else if (sum < 0) {

                l++;

            } else {

                r--;

            }
        }

        return list;
    }
}
