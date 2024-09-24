import java.util.*;

public class Huskeseddel 
{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        String input = s.nextLine();
        if (input.compareTo("0000") == 0) System.out.println("1000");
        else if (input.compareTo("9999") == 0) System.out.println("0000");
        else {
            int crypt = Integer.parseInt(input);
            crypt++;
            input = crypt+"";
            if (input.length() != 4) {
                while(input.length() != 4) {
                    input = "0"+input;
                }
            }
            String out = "";
            for (int i = input.length()-1; i >= 0; i--) {
                out = out+input.charAt(i);
            }
            System.out.println(out);
        }
    }
}

