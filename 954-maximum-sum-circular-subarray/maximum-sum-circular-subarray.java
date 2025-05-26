class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        int minSoFar = nums[0], minEndingHere = nums[0];
        int totalSum = nums[0];

             for (int i = 1; i < nums.length; i++) {
        
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);

                    minEndingHere = Math.min(nums[i], minEndingHere + nums[i]);
            minSoFar = Math.min(minSoFar, minEndingHere);

        
            totalSum += nums[i];
        }

        
        if (maxSoFar < 0) return maxSoFar;

        
        int circularMaxSum = totalSum - minSoFar;

        
        return Math.max(maxSoFar, circularMaxSum);
    }
}