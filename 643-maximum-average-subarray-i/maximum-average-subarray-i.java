class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int right=k-1;
      
        int currSum=0;
        double avg=0;
        for(int i=left;i<=right;i++){
            currSum+=nums[i];
        }
        int maxSum=currSum;
        while(right<n-1){
            currSum-=nums[left];
            left++;
            right++;
            currSum+=nums[right];
            maxSum=Math.max(maxSum,currSum);
        }
        avg=(double) maxSum/k;
        return avg;

    }
}