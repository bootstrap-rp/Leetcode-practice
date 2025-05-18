class Solution {
    public boolean isPalindrome(String s) {
        char[] chars=s.toLowerCase().toCharArray();
        int left=0;
        int right=s.length()-1;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(chars[left])){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(chars[right])){
                right--;
            }
            if(chars[left]!=chars[right]){
                return false;
            }
            left++;
            right--;

 
        }

        return true;
    }
}