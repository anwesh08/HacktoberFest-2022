class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> List = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!List.contains(nums[i])) 
                List.add(nums[i]);
        }
        int k = List.size();
        for (int i = 0; i < List.size(); i++) {
            nums[i] = List.get(i);
        }
        return k;
    }
}