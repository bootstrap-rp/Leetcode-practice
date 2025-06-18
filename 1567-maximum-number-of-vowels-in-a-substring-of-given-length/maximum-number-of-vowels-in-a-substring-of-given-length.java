class Solution {
    public int maxVowels(String s, int k) {
        int currVow=0;
        int maxVow=0;
        for(int i=0;i<=k-1;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                currVow++;
            }
        }
            maxVow=currVow;

            for(int i=k;i<s.length();i++){
                if(s.charAt(i-k)=='a' || s.charAt(i-k)=='e' || s.charAt(i-k)=='i' || s.charAt(i-k)=='o' || s.charAt(i-k)=='u'){
                    currVow--;
                }
                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                    currVow++;
                }

                maxVow=Math.max(maxVow,currVow);


            }
            return maxVow;
        
    }
}