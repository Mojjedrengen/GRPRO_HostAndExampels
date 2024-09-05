
/**
 * Write a description of class Loop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loop
{
    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        } 
    }
}
