class Solution {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        String repeted=word;
        while(sequence.contains(repeted)){
            count++;
            repeted+=word;
            
        }
        return count;
    }
}