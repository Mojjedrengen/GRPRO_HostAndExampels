
/**
 * Write a description of class InsufficientFundsException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InsufficientFundsException extends Exception
{
    int diff;
    public InsufficientFundsException(int diff) {
        super("Insufficient funds");
        this.diff = diff;
    }
    
    public int getDifference() {
        return this.diff;
    }
}
