
/**
 * Write a description of class Sep24 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sep24
{
    static void main() {
        Ordre order = new Ordre("Name");
        order.addProduct(new Produkt("Product1", 1));
        order.addProduct(new Produkt("Product2", 2));
        order.addProduct(new Produkt("Product3", 3));
        order.addProduct(new Produkt("Product4", 4));
        order.addProduct(new Produkt("Product5", 5));
        order.addProduct(new Produkt("Product6", 6));

        order.cheapestProduct().display();
    }

    static void test() {
        Pizza margherita = new Pizza("Margherita", 69.0);
        margherita.addIngredient("tomato");
        margherita.addIngredient("cheese");
        Pizza hawaii = new Pizza("Hawaii", 76.0);
        hawaii.addIngredient("tomato");
        hawaii.addIngredient("cheese");
        hawaii.addIngredient("ham");
        hawaii.addIngredient("pineapple");
        Pizza dansk = new Pizza("Danese", 85.0);
        dansk.addIngredient("liver pâté");
        dansk.addIngredient("bacon");
        dansk.addIngredient("cucumber");
        Restaurant pizzit = new Restaurant("PizzIT");
        pizzit.addPizza(margherita);
        pizzit.addPizza(hawaii);
        pizzit.addPizza(dansk);
        System.out.println(pizzit);
    }
}
