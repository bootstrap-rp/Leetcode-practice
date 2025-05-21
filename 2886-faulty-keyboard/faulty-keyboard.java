class Solution {
    public String finalString(String s) {
        char[] result = new char[s.length()];
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'i') {
                reverse(result, index);
            } else {
                result[index] = ch;
                index++;
            }
        }
        return new String(result, 0, index);
    }

    public void reverse(char[] result, int index) {
        int left = 0, right = index - 1;
        while (left < right) {
            char temp = result[left];
            result[left] = result[right];
            result[right] = temp;
            left++;
            right--;
        }
    }
}