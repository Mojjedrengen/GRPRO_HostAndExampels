import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Restaurant {
    private String name;
    private List<Pizza> pizzas;
    private Map<String, Pizza> cheapestIngredient;
    public Restaurant(String name) {
        this.name = name;
        pizzas = new ArrayList<>();
        cheapestIngredient = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public String toString() {
        return "Restaurant name: " + name +
        ", pizzas: " + pizzas;
    }
    
    private Pizza findCheapPizza(String ingrediant) {
        int min = Integer.MAX_VALUE;
        Pizza cheapest = null;
        for (Pizza pizza : pizzas) 
        {
            return null;
        }
        return null;
    }
}