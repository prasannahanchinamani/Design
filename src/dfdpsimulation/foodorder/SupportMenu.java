package dfdpsimulation.foodorder;

import dfdpsimulation.foodorder.fooditems.Burger;
import dfdpsimulation.foodorder.fooditems.Drinks;
import dfdpsimulation.foodorder.fooditems.Food_item;
import dfdpsimulation.foodorder.fooditems.Pizza;
import dfdpsimulation.foodorder.payment.CreditCardPayment;
import dfdpsimulation.foodorder.payment.PaymentStrategy;
import dfdpsimulation.foodorder.payment.PayPalPayment;
import dfdpsimulation.foodorder.payment.UpiPayment;

import java.util.Scanner;

public class SupportMenu {
    static Scanner scanner = new Scanner(System.in);
    static Food_item food;
    static PaymentStrategy paymentStrategy;

    static void menu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1) Pizza");
            System.out.println("2) Burger");
            System.out.println("3) Drinks");
            System.out.println("4) Exit");
            System.out.print("Enter choice to Order: ");

            int ch = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (ch) {
                case 1:
                    food = new Pizza();
                    handleOrder();
                    break;
                case 2:
                    food = new Burger();
                    handleOrder();
                    break;
                case 3:
                    food = new Drinks();
                    handleOrder();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void handleOrder() {
        paymentMenu();
        if (paymentStrategy != null) {
            food.prepare();
            paymentStrategy.pay(250);
        }
    }

    static void paymentMenu() {
        while (true) {
            System.out.println("\nPayment Options:");
            System.out.println("1) Credit Card");
            System.out.println("2) UPI");
            System.out.println("3) PayPal");
            System.out.println("4) Cancel Payment");
            System.out.print("Enter payment choice: ");

            int ch = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (ch) {
                case 1:
                    System.out.print("Enter the Card Number: ");
                    String cardNumber = scanner.nextLine();
                    System.out.print("Enter the Card Holder Name: ");
                    String name = scanner.nextLine();
                    paymentStrategy = new CreditCardPayment(cardNumber, name);
                    return;
                case 2:
                    System.out.print("Enter UPI ID: ");
                    String upiId = scanner.nextLine();
                    paymentStrategy = new UpiPayment(upiId);
                    return;
                case 3:
                    System.out.print("Enter PayPal Email: ");
                    String email = scanner.nextLine();
                    paymentStrategy = new PayPalPayment(email);
                    return;
                case 4:
                    System.out.println("Payment cancelled.");
                    paymentStrategy = null;
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
