
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
        
        int temp = 0;
        
        if (currPoss < targetPoss){
            if ((targetPoss - currPoss) <= 180){
                temp = (targetPoss - currPoss) % 360;
            } else {
                temp = (targetPoss - currPoss) % -360;
                if (temp > 0) {
                    temp -= 360;
                }
            }
        } else if (currPoss > targetPoss) {
            if ((currPoss - targetPoss) < 180) {
                temp = (targetPoss - currPoss) % -360;
            } else {
                temp = (targetPoss - currPoss) % 360;
                if (temp < 0) {
                    temp += 360;
                }
            }
        }
        
        System.out.println(temp);
        
    }
}
