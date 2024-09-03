
/**
 * Write a description of class QuadrantSelection here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
/*
 * import java.util.Scanner;
public class QuadrantSelection
{
    public static void main(String[] args) 
    {
         Scanner scanner = new Scanner(System.in);   
    }
}
 * 
 */
import java.util.Scanner;
public class QuadrantSelection
{
    public static void main(String[] args) 
    {
         Scanner scanner = new Scanner(System.in);   
         int x = scanner.nextInt();
         int y = scanner.nextInt();
         
         if(x > 0 && y > 0) System.out.println(1);
         else if (x < 0 && y > 0) System.out.println(2);
         else if (x < 0 && y < 0) System.out.println(3);
         else if (x > 0 && y < 0) System.out.println(4);
    }
}
