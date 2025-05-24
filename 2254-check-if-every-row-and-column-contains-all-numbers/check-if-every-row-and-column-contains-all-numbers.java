public class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            boolean[] rowCheck = new boolean[n + 1]; 
            boolean[] colCheck = new boolean[n + 1];
            
            for (int j = 0; j < n; j++) {
                
                int rowNum = matrix[i][j];
                if (rowNum < 1 || rowNum > n || rowCheck[rowNum]) {
                    return false; 
                }
                rowCheck[rowNum] = true;
                
                
                int colNum = matrix[j][i];
                if (colNum < 1 || colNum > n || colCheck[colNum]) {
                    return false;                 }
                colCheck[colNum] = true;
            }
        }
        
        return true; 
           }
}