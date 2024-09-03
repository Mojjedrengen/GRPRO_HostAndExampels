
/**
 * Write a description of class Windmill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Windmill
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int currPoss = s.nextInt();
        int targetPoss = s.nextInt();
        
        int temp = targetPoss - currPoss;
        
        if (temp > 180) {
           temp = 360 - temp; 
           System.out.println("temp > 180");
        } else if (temp < -180){
            temp = 180 + temp;
            System.out.println("temp < -180");
        }
        
        System.out.println(temp);
    }
}
