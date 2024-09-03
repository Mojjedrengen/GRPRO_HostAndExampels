import java.util.Scanner;

public class timeloop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int length = s.nextInt();
        
        for (int i = 0; i < length; i++){
            System.out.println(i+1+" Abracadabra");
        }
    }
}