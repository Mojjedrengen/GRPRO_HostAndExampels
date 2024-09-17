import java.util.Scanner;

public class QuickEstimates 
{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        int N = s.nextInt();
        
        int[] cost = new int[N];
        
        for (int i = 0; i < cost.length; i++)
        {
            double temp = s.nextInt();
            if (temp == 0)
            {
                cost[i] = 1;
            } else
            {
                temp = Math.log10(temp);
                cost[i] = (int)Math.floor(temp)+1;
            }
        }
        for (int estimet : cost)
        {
            System.out.println(estimet);
        }
    }
}