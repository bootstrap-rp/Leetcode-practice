class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes={
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
        HashSet<String> set=new HashSet<>();

        for(String word: words){
            StringBuilder morseWord=new StringBuilder();
            for(char c: word.toCharArray()){
                morseWord.append(morseCodes[c-'a']);
            }
            set.add(morseWord.toString());
        }
        return set.size();
    }
}