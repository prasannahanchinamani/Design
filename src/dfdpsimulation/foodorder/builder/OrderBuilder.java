package dfdpsimulation.foodorder.builder;

class Order {
    String foodName;
    boolean extraCheese;
    boolean extraSpice;
    boolean extraItems;

    public Order(String foodName,boolean extraCheese, boolean extraItems, boolean extraSpice) {
        this.extraCheese = extraCheese;
        this.extraItems = extraItems;
        this.extraSpice = extraSpice;
        this.foodName = foodName;
    }

    public void show() {
        System.out.println("Order: " + foodName);
        if (extraCheese) System.out.println(" - Extra Cheese");
        if (extraSpice) System.out.println(" - Extra Spicy");
        if (extraItems) System.out.println("--Yes taken Extra Food");
    }
}
public class OrderBuilder{
    String foodName;
    boolean extraCheese;
    boolean extraSpice;
    boolean extraItems;

    public OrderBuilder setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
        return  this;
    }

    public OrderBuilder setExtraItems(boolean extraItems) {
        this.extraItems = extraItems;
        return this;
    }

    public OrderBuilder setExtraSpice(boolean extraSpice) {
        this.extraSpice = extraSpice;
        return this;
    }

    public OrderBuilder setFoodName(String foodName) {
        this.foodName = foodName;
        return this;
    }
    public Order build(){
        return new Order(foodName,extraCheese,extraSpice,extraItems);
    }
}
