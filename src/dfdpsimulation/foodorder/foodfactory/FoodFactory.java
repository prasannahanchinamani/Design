package dfdpsimulation.foodorder.foodfactory;


import dfdpsimulation.foodorder.fooditems.Burger;
import dfdpsimulation.foodorder.fooditems.Drinks;
import dfdpsimulation.foodorder.fooditems.Food_item;
import dfdpsimulation.foodorder.fooditems.Pizza;

public class FoodFactory {


    public static Food_item getFood(String foodName) {
        if (foodName == null) {
            return null;
        }
        switch (foodName.toLowerCase()) {
            case "pizza":
                return new Pizza();
            case "burger":
                return new Burger();
            case "drinks":
                return new Drinks();
            default:
                System.out.println("Sorry, we don't have " + foodName + " on the menu.");
                return null;
        }
    }
}
