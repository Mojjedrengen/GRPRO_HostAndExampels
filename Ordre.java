
/**
 * Write a description of class Ordre here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Ordre
{
    private String name;
    private List<Produkt> products;
    
    public Ordre(String name) {
        this.name = name;
        this.products = new ArrayList<Produkt>();
    }
    
    public void addProduct(Produkt product) {
        this.products.add(product);
    }
    
    public int totalPrice() {
        int sum = 0;
        for (Produkt product : this.products) {
            sum += product.getPrice();
        }
        return sum;
    }
    
    public void display() {
        System.out.println("Your order is:");
        for (Produkt product : this.products) {
            System.out.print("- ");
            product.display();
        }
        System.out.println("The total price is: "+totalPrice()+"kr.");
    }
    
    public int cheapestPrice() {
        int cheapest = Integer.MAX_VALUE;
        for (Produkt product : this.products) {
            if (cheapest > product.getPrice()) cheapest = product.getPrice();
        }
        return cheapest;
    }
    
    public Produkt cheapestProduct() {
        int cheapest = Integer.MAX_VALUE;
        Produkt cheapestProduct = null; 
        for (Produkt product : this.products) {
            if (cheapest > product.getPrice()) {
                cheapest = product.getPrice();
                cheapestProduct = product;
            }
        }
        return cheapestProduct;
    }
}
