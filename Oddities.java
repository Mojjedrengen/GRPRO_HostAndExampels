import java.util.*;

public class Oddities 
{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        int length = s.nextInt();
        
        for (int i = 0; i < length; i++)
        {
            int input = s.nextInt();
            if (input % 2 == 0) System.out.println(input+" is even");
            else System.out.println(input+ " is odd");
        }
    }
}


