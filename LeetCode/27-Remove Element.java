class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> List = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) List.add(nums[i]);
        }
        int k = List.size();
        for (int i = 0; i < List.size(); i++) {
            nums[i] = List.get(i);
        }
        return k;
    }
}