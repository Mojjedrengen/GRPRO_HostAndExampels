
/**
 * Write a description of class DringingWater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class DringingWater
{
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in); 
       
       System.out.println("Please type your weight in kg");
       float kg = s.nextFloat();
       System.out.println("Is it hot outside?\nTyper 1 for yes");
       int answere = s.nextInt();
        
       float water = 35*kg;
       
       if (answere == 1) 
       {
           water *= 1.1;
           water = Math.round(water);
       }
       
       System.out.println("You weight "+kg+"kg\nSo you should drink "+water+" ml water \nwhich is "+water/1000.0f+" l water");
    }
}
