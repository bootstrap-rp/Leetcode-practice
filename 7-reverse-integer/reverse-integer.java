public class Solution {
    public int reverse(int x) {
    
        int sign = x >= 0 ? 1 : -1;
        x = Math.abs(x);
        
   
        long reversedNum = 0; 
        while (x > 0) {
          
            int digit = x % 10;
          
            if (reversedNum > Integer.MAX_VALUE / 10) {
                return 0;
            }
            reversedNum = reversedNum * 10 + digit;
            x /= 10;
        }
        
      
        reversedNum *= sign;
        if (reversedNum < Integer.MIN_VALUE || reversedNum > Integer.MAX_VALUE) {
            return 0;
        }
        
        return (int) reversedNum;
    }
}