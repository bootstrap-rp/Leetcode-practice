class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int lsum=0;
        int rsum=0;
        int maxSum=0;
        for(int i=lsum;i<=k-1;i++){
            lsum+=cardPoints[i];
            maxSum=lsum;
        }
        int rind=n-1;
        for(int i=k-1;i>=0;i--){
            lsum-=cardPoints[i];
            rsum+=cardPoints[rind];
            rind--;

            maxSum=Math.max(maxSum,lsum+rsum);
        }
        return maxSum;


    }
}