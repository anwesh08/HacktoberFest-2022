class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0 , l = nums.length , i = 0;
        while(j < l){
            if (nums[j] == 0) {
                j++;
            }
            else{
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            }
        }
    }
}