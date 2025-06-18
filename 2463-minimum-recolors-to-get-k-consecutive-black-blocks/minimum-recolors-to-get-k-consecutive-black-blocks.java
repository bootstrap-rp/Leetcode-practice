class Solution {
    public int minimumRecolors(String blocks, int k) {
        int currWhite=0;
        int recolor=0;
        for(int i=0;i<=k-1;i++){
            if(blocks.charAt(i)=='W'){
                currWhite++;
            }
        }
        recolor=currWhite;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i-k)=='W'){
                currWhite--;
            }
            if(blocks.charAt(i)=='W'){
                currWhite++;
            }

            recolor=Math.min(recolor,currWhite);
        }
        return recolor;
    }
}