
/**
 * Write a description of class ClassWater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ClassWater
{
    static Scanner s = new Scanner(System.in);
    static float calculator(float weight, float amount) {
        float result = weight*amount;
        float resultLiter = result/1000.0f;
        
        return resultLiter;
    }
    
    public static void main(String[] args){
        float amount = 35.0f;
        
        System.out.println("Skriv din vægt");
        
        float weight = s.nextFloat();
        
        System.out.println("Du bør drikke "+calculator(weight, amount)+"l vand dagligt");
    }
}
