class Solution {
    public int secondHighest(String s) {
        int n=s.length();
        int max=-1;
        int smax=-1;

        for(int i=0;i<n;i++){
            char c=s.charAt(i);

            if(Character.isDigit(c)){
                int ch= c-'0';
                if(ch>max){
                    
                    smax=max;
                    max=ch;
                }
                else if(ch>smax && ch!=max){
                    smax=ch;
                }
            }
            }
            
            return smax;

        }
    }