
/**
 * Write a description of class Tempertur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Tempertur
{
    public static void main(String[] args) 
    {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Choose a converter \n 1. Celsius to Fehrenheit \n 2. Fehrenheit to Celsius");
         int input = scanner.nextInt();
         if (input == 1) cel2fahr(scanner);
         else if (input == 2) fahr2cel(scanner);
         else System.out.println("Wrong input exiting");
    }
    
    private static void cel2fahr(Scanner scanner)
    {
        System.out.println("Write degree in celcius");
        float c = scanner.nextFloat();
        float f = c*9/5+32;
        System.out.println("Degree in fehrenheit is: "+f+"F"); 
    }
    private static void fahr2cel(Scanner scanner)
    {
        System.out.println("Write degree in fehrenheit");
        float f = scanner.nextFloat();
        float c = (f-32)*5/9;
        System.out.println("Degree in celcius is: "+c+"C");
    }
}
