
/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account
{
    private float balance;
    
    public Account(){
        this.balance = 0f;
    }
    
    public Account(float balance) {
        this.balance = balance;
    }
    
    void deposit(float amount) {
        if (amount > 0) this.balance += amount;
        else System.out.println("*** Invalid operation!");
    }
    
    void withdraw(float amount) {
        if (amount < 0) System.out.println("*** Invalid operation!");
        else if (amount <= this.balance) this.balance -= amount;
        else System.out.println("*** Insuffient funds!");
    }
    
    float getBalance(){
        return this.balance;
    }
}
