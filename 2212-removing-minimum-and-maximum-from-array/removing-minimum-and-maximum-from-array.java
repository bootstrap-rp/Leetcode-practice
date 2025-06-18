class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIdx = 0, maxIdx = 0;

        for (int i = 0; i < n; ++i) {
            if (nums[i] < nums[minIdx]) minIdx = i;
            if (nums[i] > nums[maxIdx]) maxIdx = i;
        }

        if (minIdx > maxIdx) {
            int temp = minIdx;
            minIdx = maxIdx;
            maxIdx = temp;
        }

        int fromFront = maxIdx + 1;
        int fromBack = n - minIdx;
        int fromBoth = (minIdx + 1) + (n - maxIdx);

        return Math.min(fromFront, Math.min(fromBack, fromBoth));
    }
}