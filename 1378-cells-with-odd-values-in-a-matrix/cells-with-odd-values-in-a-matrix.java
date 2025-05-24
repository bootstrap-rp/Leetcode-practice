class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows=new int[m];
        int[] cols=new int[n];

        for(int[] i:indices){
            int row=i[0];
            int col=i[1];
            rows[row]++;
            cols[col]++;
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((rows[i]+cols[j])%2!=0){
                    count++;
                }
            }
        }
     return count;
    }
}