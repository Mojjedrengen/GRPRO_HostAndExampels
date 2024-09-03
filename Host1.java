
/**
 * Write a description of class Host here.
 * Høst opgave 1
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Host1
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float h = input.nextFloat();
        float b = input.nextFloat();
        float r;
        r = h*b/2;
        System.out.println(r);
        //System.out.println(ProblemA(System.in, System.in));
    }
}
