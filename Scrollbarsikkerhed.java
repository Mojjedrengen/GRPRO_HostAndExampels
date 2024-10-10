import java.util.*;

public class Scrollbarsikkerhed 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int currentAmount = 0, full = 0;
        while (s.hasNextLine()) {
            String in = s.nextLine();
            if (in.equals("Break")) break; //Code to debug
            if (in.equals("Gæst ind")) currentAmount += (currentAmount == -1) ? 2 : 1;
            else currentAmount -= (currentAmount == 1) ? 2 : 1;
            
            if (Math.abs(currentAmount) > full) full = Math.abs(currentAmount);
        }
        s.close();
        System.out.println(full);
    }
}


