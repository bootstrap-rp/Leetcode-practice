class Solution {
    public int missingNumber(int[] nums) {

        int  n=nums.length;

        int expectedsum=(n*(n+1)/2);
        int currsum=0;

        for(int i:nums){
            currsum+=i;
        }

        return expectedsum-currsum;
    }
}