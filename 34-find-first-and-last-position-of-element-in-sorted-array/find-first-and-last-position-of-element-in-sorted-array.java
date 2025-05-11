class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        if (nums == null || nums.length == 0){ 
            return res;
        }
        
       
        res[0] = findLeft(nums, target);
       
        res[1] = findRight(nums, target);
        
        return res;
    }
    
    public int findLeft(int[] nums, int target) {
        int start = 0;
        int end= nums.length - 1;
        int pos = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                pos= mid; 
                end = mid - 1; 
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return pos;
    }
    
    public int findRight(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int pos = -1;
        
        while (start <= end) {
            int mid = start+ (end - start) / 2;
            if (nums[mid] == target) {
                pos = mid; 
                start = mid + 1; 
            } else if (nums[mid] < target) {
                start= mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return pos;
    }
}