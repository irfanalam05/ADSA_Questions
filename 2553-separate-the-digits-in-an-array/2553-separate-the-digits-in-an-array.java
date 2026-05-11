class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            ArrayList<Integer> arr1 = new ArrayList<>();
            while(num > 0) {
                int d= num % 10;
                arr1.add(d);
                num = num / 10;
            }

            for(int j = arr1.size() - 1; j >= 0; j--) {
                arr.add(arr1.get(j));
            }
        }

        int[] res = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        return res;
    }
}