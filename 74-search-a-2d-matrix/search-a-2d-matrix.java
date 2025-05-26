class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        int start=0;
        int end=m*n-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            int midval=matrix[mid/n][mid%n];

            if(midval==target){
                return true;
            }
            else if(midval<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}