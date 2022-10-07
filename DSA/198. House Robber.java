class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        
        if( len == 0)
            return len;
        if(len == 1)
            return nums[0];
        if(len == 2)
            return Math.max(nums[0], nums[1] );
        
        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);
        
        for( int i = 2; i < nums.length; i++){
            int curr = Math.max(second, first+ nums[i]);
            first = second;
            second = curr;
        }
        return second;
    }
}