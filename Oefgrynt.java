import java.util.*;

public class Oefgrynt 
{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        int t = s.nextInt();
        
        for (int i = 1; i <= t; i++)
        {
            boolean hasPrint = false;
            
            if (i % 3 == 0)
            {
                hasPrint = true;
                System.out.print("øf");
            }
            if (i % 5 == 0)
            {
                hasPrint = true;
                System.out.print("grynt");
            }
            if (!hasPrint) System.out.print(i%100);
            System.out.print("\n");
        }
    }
}