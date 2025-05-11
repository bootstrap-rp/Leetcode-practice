class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int m=nums1.length;
        int n=nums2.length;
        int total=m+n;
        int mid=total/2;
        int i=0;int j=0;int count=0;
        double prev=0;double curr=0;

        while(count<=mid){
            prev=curr;
            if(i<m &&(j>=n || nums1[i]<=nums2[j])){
                curr=nums1[i];
                i++;

            }
            else{
                curr=nums2[j];
                j++;
            }
            count++;

        }
        if(total%2==1){
            return curr;
        }
        return(prev + curr)/2.0;

        
    }
}