class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        for(int i = 0; i < aliceSizes.length; i++)
            sumA += aliceSizes[i];
        for(int i = 0; i < bobSizes.length; i++)
            sumB += bobSizes[i];
        int diff = (sumA - sumB) / 2;
        Arrays.sort(aliceSizes);
        for (int num : bobSizes) {
            if (search(aliceSizes, num + diff) != -1)
                return new int[] {num + diff, num};
        }
        return null;
    }
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target)
                end = mid - 1;
            else if (nums[mid] < target)
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }

}