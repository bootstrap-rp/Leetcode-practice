class Solution {
    public int strStr(String haystack, String needle) {
        int lenhay=haystack.length();
        int lenneedle=needle.length();

        if(haystack.isEmpty())return 0;
        if(lenhay<lenneedle)return -1;

        for(int i=0;i<=lenhay-lenneedle;i++){
            if(haystack.substring(i,i+lenneedle).equals(needle)){
                return i;
            }
            

        }
        return -1;
    }
}