import java.util.*;

public class BookingARoom 
{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        int r = s.nextInt();
        int n = s.nextInt();
        
        ArrayList<Integer> booked = new ArrayList<>();
        
        if (n >= r) System.out.println("too late");
        else 
        {
            for (int i = 0; i < n; i++) 
            { 
                booked.add(s.nextInt());
            }   
            for (int i = 1; i <= r; i++)
            {
                if (!booked.contains(i)) 
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
