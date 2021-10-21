class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int lprod = 1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            answer[i] = lprod;
            lprod *= nums[i];
        }
        int rprod = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rprod;
            rprod *= nums[i];
        }
        return answer;
    }
}