class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxi = 0;
        int low =0;
        int high = 0;
        char[] s1 = s.toCharArray();
        while(high<s1.length){
            if(!set.contains(s1[high])){
                set.add(s1[high]);
                high++;
            }
            else{
                set.remove(s1[low]);
                low++;
            }
            maxi = Math.max(maxi,high-low);
        }
        return maxi;
    }
}