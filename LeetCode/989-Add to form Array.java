class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = num.length - 1; i >= 0; i--) {
            int n = num[i];
            int sum = n + k;
            int rem = sum % 10;
            list.add(0, rem);
            k = sum / 10;
        }
        while (k > 0) {
            list.add(0, k % 10);
            k /= 10;
        }
        return list;
    }
}