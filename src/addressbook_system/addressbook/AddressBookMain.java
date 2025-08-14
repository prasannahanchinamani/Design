package addressbook_system.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        System.out.println("Welcome to Address Book Program!");


        boolean addMore = true;
        while (addMore) {
            System.out.println("\nEnter First Name:");
            String firstName = scanner.nextLine();

            System.out.println("Enter Last Name:");
            String lastName = scanner.nextLine();

            System.out.println("Enter Address:");
            String address = scanner.nextLine();

            System.out.println("Enter City:");
            String city = scanner.nextLine();

            System.out.println("Enter State:");
            String state = scanner.nextLine();

            System.out.println("Enter ZIP Code:");
            String zip = scanner.nextLine();

            System.out.println("Enter Phone Number:");
            String phoneNumber = scanner.nextLine();

            System.out.println("Enter Email:");
            String email = scanner.nextLine();


            Contacts contact = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);


            addressBook.addContact(contact);


            System.out.println("\nDo you want to add another contact? (yes/no):");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                addMore = false;
            }
        }

        System.out.println("\nAll Contacts in Address Book:");
        addressBook.showAllContacts();

        scanner.close();
    }
}
