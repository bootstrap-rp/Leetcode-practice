public class Solution {
    public String reverseWords(String s) {
        
        char[] chars = s.toCharArray();
        int n = chars.length;
        
       
        StringBuilder word = new StringBuilder();
        java.util.List<String> words = new java.util.ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (chars[i] != ' ') {
                word.append(chars[i]);
            } else if (word.length() > 0) {
                words.add(word.toString());
                word.setLength(0); 
            }
        }
        
        if (word.length() > 0) {
            words.add(word.toString());
        }
        

        StringBuilder result = new StringBuilder();
        for (int i = words.size() - 1; i >= 0; i--) {
            result.append(words.get(i));
            if (i > 0) {
                result.append(" "); 
            }
        }
        
        return result.toString();
    }
}