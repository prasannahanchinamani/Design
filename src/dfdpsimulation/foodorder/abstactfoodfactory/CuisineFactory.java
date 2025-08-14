package dfdpsimulation.foodorder.abstactfoodfactory;

import dfdpsimulation.foodorder.fooditems.Food_item;

public interface CuisineFactory {
    Food_item preparedWithCusine(String foodName);
}
