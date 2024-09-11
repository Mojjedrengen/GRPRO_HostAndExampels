import java.util.*;

public class IsItHalloween 
{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        String input = s.nextLine();
        System.out.println(input);
        
        if (input.contentEquals("OCT 31")) System.out.println("yup");
        else if (input.contentEquals("DEC 25")) System.out.println("yup");
        else System.out.println("nope");
    }
}


