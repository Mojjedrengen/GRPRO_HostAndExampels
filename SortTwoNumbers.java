import java.util.*;

public class SortTwoNumbers 
{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        int a = s.nextInt(), b = s.nextInt();
        
        if (a>b) {
            System.out.println(b);
            System.out.println(a);
        }
        else if (b>=a) {
            System.out.println(a);
            System.out.println(b);
        }
    }
}


