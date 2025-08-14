package dfdpsimulation.foodorder.abstactfoodfactory;

import dfdpsimulation.foodorder.fooditems.Burger;
import dfdpsimulation.foodorder.fooditems.Drinks;
import dfdpsimulation.foodorder.fooditems.Food_item;
import dfdpsimulation.foodorder.fooditems.Pizza;

public class ItalianFactory implements CuisineFactory {


    @Override
    public Food_item preparedWithCusine(String foodName) {
        if (foodName == null) {
            return null;
        }
        switch (foodName.toLowerCase()) {
            case "pizza":
                System.out.println("Its include Italian Cuisines");
                return new Pizza();
            case "burger":
                System.out.println("Its include Italian Cuisines");
                return new Burger();
            case "drinks":
                System.out.println("Its include Italian Cuisines");
                return new Drinks();
            default:
                System.out.println("Sorry, we don't have " + foodName + " on the menu.");

        }
        return null;
    }
}

