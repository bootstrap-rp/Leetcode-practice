class Solution {
    public boolean isPowerOfTwo(int n) {
        int count=0;

        if (n <= 0) return false;
        
        for(int i=0;i<32;i++){
            int bitmask=1<<i;
            if((bitmask & n)!=0){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        return false;
    }
}