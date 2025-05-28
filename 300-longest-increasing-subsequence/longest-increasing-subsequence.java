class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;

        int[] tails=new int[n];
        int len=0;

        tails[0]=nums[0];
        len=1;
        for(int i=1;i<n;i++){
            if(nums[i]>tails[len-1]){
                tails[len]=nums[i];
                len++;
            }
            else if(nums[i]<tails[len-1]){
                int start=0;int end=len-1;
                while(start<=end){
                    int mid=start+(end-start)/2;
                    if(tails[mid]>=nums[i]){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
                tails[start]=nums[i];
            }
        }        
        return len;
        
        
    }
}