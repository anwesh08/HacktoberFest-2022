class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j] || 2 * arr[i] == arr[j]) return true;
            }
        }
        return false;
    }
}