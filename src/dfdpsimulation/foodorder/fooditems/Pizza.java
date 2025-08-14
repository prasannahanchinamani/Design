package dfdpsimulation.foodorder.fooditems;

public class Pizza implements Food_item {
    @Override
    public void prepare() {
        System.out.println("Pizza is preparing... Wait five minutes to receive. We will announce with your order number  OR Name.. .");
    }
}