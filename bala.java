public class bala {
        int reverse (int x){
            int y = 0;
            while ( x > 0 ){
                y = y * 10 + x % 10;
                x = x / 10;
            }
            return y;
        }
        public boolean isPalindrome(int x) {
            if (reverse(x) == x)
                return true;
            else
                return false;
        }
}
