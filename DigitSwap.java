
/**
 * Write a description of class DigitSwap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class DigitSwap
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        
        int one = input%10;
        int ten = (input-one)/10;
        
        int swaped = one*10+ten;
        System.out.println(swaped);
    }
}
