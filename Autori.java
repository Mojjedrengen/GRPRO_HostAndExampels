
/**
 * Write a description of class Autori here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Autori
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        
        String[] split = input.split("-");
        
        for (int i = 0; i < split.length; i++)
        {
            System.out.print(split[i].charAt(0));
        }
    }
}
