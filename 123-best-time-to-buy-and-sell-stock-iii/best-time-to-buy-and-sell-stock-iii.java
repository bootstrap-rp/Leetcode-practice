class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(prices==null || n<2){
            return 0;
        }

        int[] first=new int[n];
        int minprice=prices[0];
        first[0]=0;

        for(int i=1;i<n;i++){
            minprice=Math.min(minprice,prices[i]);
            first[i]=Math.max(first[i-1],prices[i]-minprice);
        }

        int[] second=new int[n];
        int maxprice=prices[n-1];
        second[n-1]=0;

        for(int i=n-2;i>=0;i--){
            maxprice=Math.max(maxprice,prices[i]);
            second[i]=Math.max(second[i+1],maxprice-prices[i]);
        }
        int maxprofit=0;
        for(int i=0;i<n;i++){
            maxprofit=Math.max(maxprofit,first[i]+second[i]);
        }
        return maxprofit;
    }
}