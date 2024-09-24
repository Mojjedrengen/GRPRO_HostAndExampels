
/**
 * Write a description of class Produkt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Produkt
{
    private int price;
    private String name;
    
    public Produkt(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int newPrice) {
        this.price = newPrice;
    }
    public void display() {
        System.out.println(this.name+": "+ this.price+"kr.");
    }
}
