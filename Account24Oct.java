
/**
 * Write a description of class Account24Oct here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account24Oct
{
   String owner;
   int balance;
   
   Account24Oct(String owner){
       if (owner == null) throw new NullPointerException("owner is null");
       this.owner = owner;
       balance = 0;
   }
   
   void deposit (int amount) throws IllegalArgumentException {
       if (amount <= 0) throw new IllegalArgumentException("Amount can't be negative");
       balance += amount;
   }
   
   void withdraw(int amount) throws InsufficientFundsException {
       if (balance - amount < 0) throw new InsufficientFundsException(balance - amount);
       balance -= amount;
   }
   
   void inspect(){
       System.out.print("balance: "+ balance+"\n");
   }
}
