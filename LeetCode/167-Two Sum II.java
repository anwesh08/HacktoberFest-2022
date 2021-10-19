class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int i = 0, n = numbers.length - 1;
        while (i < n) {
            if (numbers[i] + numbers[n] == target) {
                res[0] = i + 1; res[1] = n + 1;
                break;
            }
            if (numbers[i] + numbers[n] < target) i++;
            else n--;
        }
        return res;
    }
}