class Solution {
    public boolean search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return true;
            }
            while(start<mid && nums[start]==nums[mid]){
                start++;
            }
            while(end>mid && nums[mid]==nums[end]){
                end--;
            }
            if(start>end){
                return false;
            }

           
            

            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && target<nums[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }
            else{
                if(nums[mid]<target && target<=nums[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return false;
    }
}