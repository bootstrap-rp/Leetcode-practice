class Solution {
    public int countPairs(List<Integer> nums, int target) {
        
        Collections.sort(nums);
        int start=0;
        int end=nums.size() -1;
        int count=0;

        while(start<=end){
            if(nums.get(start)+nums.get(end)<target){
                count+=end-start;
                start++;
            }
            else{
                end--;
            }

        }
        return count;
    }
}