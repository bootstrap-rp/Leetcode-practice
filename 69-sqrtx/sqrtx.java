class Solution {
    public int mySqrt(int x) {
        if(x==0)return 0;
        if(x==1)return 1;
        
        long left=1;
        long right=x;
        long res=1;

        while(left<=right){
            long mid=left+(right-left)/2;
            long square=mid*mid;

            if(square==x){
                return (int) mid;
            }
            else if(square<x){
                res=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return (int) res;
    }
}