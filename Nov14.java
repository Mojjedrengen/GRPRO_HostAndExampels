
/**
 * Write a description of class Nov14 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nov14
{
    public static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n-1);
    }
    
    public static String bin(int n) {
        if (n < 2) return ""+n;
        return bin(n/2) + (n%2);
    }
    
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }
    
    public static boolean isPalindrome(String s) {
        if (s.length() < 2) return true;
        if (s.charAt(0) != s.charAt(s.length()-1)) return false;
        return isPalindrome(s.substring(1, s.length()-1));
    }
}
