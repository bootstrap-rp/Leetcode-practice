class Solution {
    public String longestPalindrome(String s) {
        if(s.isEmpty())return "";
        int n=s.length();
        int start=0;
        int maxlen=1;
        for(int i=0;i<n;i++){
            int len1=expand(s,i,i);
            int len2=expand(s,i,i+1);
            if(len1>maxlen){
                maxlen=len1;
                start=i-(len1-1)/2;

            }
            if(len2>maxlen){
                maxlen=len2;
                start=i-len2/2+1;
            }

        }
        return s.substring(start,start+maxlen);
    }

    private int expand(String s, int left,int right){
        while(left>=0 && right <s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}