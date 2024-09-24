import java.util.ArrayList;
import java.util.List;
public class Pizza {
    private String name;
    private double price;
    private List<String> ingredients;
    public Pizza(String name, double price){
        this.name = name;
        this.price = price;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients(){
        return ingredients;
    }
    
    public boolean getIngredient(String checkIngrediant) {
        for (String ingrediant : this.ingredients) 
        {
            if (checkIngrediant.equals(ingrediant)) return true;
        }
        return false;
    }

    public void addIngredient(String
    ingredient) {
        ingredients.add(ingredient);
    }

    public String toString() {
        return "Pizza name: " + name +
        ", ingredients: " + ingredients;
    }

    public double getPrice() {
        return price;
    }
}