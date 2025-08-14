package addressbook_system.addressbook;

import java.util.Scanner;

public class AddressbookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");

        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter Last Name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter Address:");
        String address = scanner.nextLine();
        System.out.println("Enter City:");
        String city = scanner.nextLine();
        System.out.println("Enter State:");
        String state = scanner.nextLine();
        System.out.println("Enter ZIP:");
        String zip = scanner.nextLine();
        System.out.println("Enter Phone Number:");
        String phone = scanner.nextLine();
        System.out.println("Enter Email:");
        String email = scanner.nextLine();

        Contacts contact = new Contacts(firstName, lastName, address, city, state, zip, phone, email);
        addressBook.addContact(contact);
    }
}
