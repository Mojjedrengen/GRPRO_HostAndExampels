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
        
        
        inputArr[0] = inputArr[0].substring(0, 1).toUpperCase() + inputArr[0].substring(1);
        inputArr[1] = inputArr[1].substring(0, 1).toLowerCase() + inputArr[1].substring(1);
        
        String out = String.join(" ", inputArr);
        
        System.out.println(out);
    }
}


