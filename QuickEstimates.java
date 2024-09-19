import java.util.Scanner;

public class QuickEstimates 
{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        int N = s.nextInt();
        
        int[] cost = new int[N];
        String frowaway = s.nextLine();
        
        for (int i = 0; i < N; i++)
        {
            String temp = s.nextLine();
            cost[i] = temp.length();
        }
        for (int estimet : cost)
        {
            System.out.println(estimet);
        }
    }
}