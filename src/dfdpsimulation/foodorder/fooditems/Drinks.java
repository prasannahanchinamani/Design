package dfdpsimulation.foodorder.fooditems;

public class Drinks implements Food_item {
    @Override
    public void prepare() {
        System.out.println("Drink: Please collect from the vendor machine when you pay the money.");
    }
}
