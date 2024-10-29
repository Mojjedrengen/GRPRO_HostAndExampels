import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Write a description of class oct24 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class oct24
{
    public static void nullPoint(){
        List<Integer> list = new ArrayList<>();
        list.add(null);
        System.out.println(list.get(0)+1);
    }
    
    public static void outOfBounds(){
        int[] arr = {1};
        System.out.println(arr[1]);
    }
    
    public static void arithmetic(){
        System.out.println(1/0);
    }
    
    public static void classCast(){
        List<Integer> list = new ArrayList<>();
        System.out.println((HashMap)list);
    }
    
    public static void numberFormat(){
        String x = "Hej";
        System.out.println(Integer.parseInt(x)+1);
    }
    
    
    
    private static void makeAccount() {
        Account24Oct acount = new Account24Oct(null);
    }
    
    public static void testAccount() {
        try {
            makeAccount();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
    
    private static void makeDeposit(Account24Oct a, int val) throws IllegalArgumentException {
        a.deposit(val);
    }
    
    public static void testAccount2() {
        int val = -5;
        Account24Oct acount = new Account24Oct("Hej");
        try {
            makeDeposit(acount, val);
        } catch (IllegalArgumentException e) {
            System.out.print("error: ");
            System.out.println(e.getMessage());
            System.out.println("Please enter legal amount");
        }
    }
    
    private static void makeWithdrawal(Account24Oct a, int amount) throws InsufficientFundsException {
        a.withdraw(amount);
    }
    
    public static void testAccount3() {
        Account24Oct acount = new Account24Oct("Hej");
        makeDeposit(acount, 5);
        try {
            makeWithdrawal(acount, 10);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Diff: " + e.getDifference());
        }
    }
}
