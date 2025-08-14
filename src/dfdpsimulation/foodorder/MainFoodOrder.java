package dfdpsimulation.foodorder;

import dfdpsimulation.foodorder.fooditems.Burger;
import dfdpsimulation.foodorder.fooditems.Drinks;
import dfdpsimulation.foodorder.fooditems.Food_item;
import dfdpsimulation.foodorder.fooditems.Pizza;
import dfdpsimulation.foodorder.payment.PaymentStrategy;

import java.util.Scanner;

public class MainFoodOrder {

    public static void main(String[] args) {
        DBconnection db1 = DBconnection.getInstance();
        db1.configure("jdbc:mysql://localhost:3306/food_order?user=root", "root", "root");
        db1.showMessage();
        SupportMenu.menu();


    }
}
