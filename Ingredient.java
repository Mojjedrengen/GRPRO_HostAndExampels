
/**
 * Write a description of class ingredient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ingredient
{
    private int quantity;
    private String unit;
    private String name;
    
    public Ingredient(int quantity, String unit, String name) {
        this.quantity = quantity;
        this.unit = unit;
        this.name = name;
    }
    
    public void display() {
        System.out.println(this.quantity+" "+this.unit+" "+name);
    }
}
