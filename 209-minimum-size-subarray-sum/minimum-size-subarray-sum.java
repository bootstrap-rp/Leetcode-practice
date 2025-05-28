class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0;

        int n=nums.length;
        int minval=Integer.MAX_VALUE;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];

            while(sum>=target){
                minval=Math.min(minval,i-start+1);
                sum-=nums[start];
                start++;
            }
 
        }

        return minval==Integer.MAX_VALUE?0:minval;
    }
}