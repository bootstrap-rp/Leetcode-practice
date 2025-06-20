class Solution {
    public boolean isHappy(int n) {
         HashSet<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false; 
            }

            seen.add(n);
            n = getSumOfSquares(n);
        }

        return true;
    }

    private int getSumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}