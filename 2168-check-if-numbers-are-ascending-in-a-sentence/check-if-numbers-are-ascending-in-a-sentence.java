public class Solution {
    public boolean areNumbersAscending(String s) {
        String[] tokens = s.split(" ");
        int prevNum = -1;
        
        for (String token : tokens) {
            if (isNumber(token)) {
                int currentNum = Integer.parseInt(token);
                if (currentNum <= prevNum) {
                    return false;
                }
                prevNum = currentNum;
            }
        }
        
        return true;
    }
    
    private boolean isNumber(String token) {
        if (token.isEmpty()) return false;
        for (char c : token.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return token.charAt(0) != '0' || token.equals("0");
    }
}