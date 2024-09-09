import java.util.*;

public class Selvsikker 
{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        String input = s.nextLine();
        input = input.replace('?', '!');
        
        String inputArr[] = input.split(" ");
        
        String temp = inputArr[0];
        
        inputArr[0] = inputArr[1];
        inputArr[1] = temp;
        
        char iToUpper = upper(inputArr[0].charAt(0));
        char iToLower = lower(inputArr[1].charAt(0));
        
        System.out.println(iToUpper+" "+iToLower);
        
        // Replace the new chars
        
        String out = String.join(" ", inputArr);
        
        System.out.println(out);
    }
    
    private static char upper(char _char) 
    {
        int charInt = _char - 32;
        return (char)charInt;
    }
    
    private static char lower(char _char) 
    {
        int charInt = _char + 32;
        return (char)charInt;
    }
}


