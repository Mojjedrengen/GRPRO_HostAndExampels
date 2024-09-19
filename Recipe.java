
/**
 * Write a description of class Recipe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;

public class Recipe
{
    private String title;
    private List<Ingredient> ingredients;
    
    public Recipe(String title) {
        this.title = title;
        this.ingredients = new ArrayList<>();
    }
    
    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }
    
    public void display() {
        System.out.println(title);
        System.out.println("---------");
        for (Ingredient ingredient : this.ingredients) {
            System.out.print("- ");
            ingredient.display();
        }
        System.out.println("---------");
    }
}
