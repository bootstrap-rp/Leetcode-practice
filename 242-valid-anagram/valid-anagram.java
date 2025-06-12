class Solution {
    public boolean isAnagram(String s, String t) {
        char[] news=s.toCharArray();
        char[] newt=t.toCharArray();

        Arrays.sort(news);
        Arrays.sort(newt);

        return Arrays.equals(news,newt);
    }
}