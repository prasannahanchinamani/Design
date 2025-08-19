package com.addressbook;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class AddressBookMain {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book!....");
        LinkedHashMap<String, AddressBook> addressbookunique = new LinkedHashMap<>();

        System.out.println("Enter the Book Name:");
        String addressbookname = scanner.nextLine();

        AddressBook addressBook = addressbookunique.getOrDefault(addressbookname, new AddressBook());
        if (addressbookunique.containsKey(addressbookname)) {
            System.out.println("Already Present The BookName");
        } else {
            addressbookunique.put(addressbookname, addressBook);
        }

        boolean addMoreContact = true;
        while (addMoreContact) {
            System.out.print("Do you want to add another contact? (yes/no): ");
            if (!scanner.nextLine().equalsIgnoreCase("yes")) {
                addMoreContact = false;
            }
        }

        if (askYesNo("Do you want to edit a contact? (yes/no): ")) {
            System.out.print("Enter First Name of contact to edit: ");
            String editFirstName = scanner.nextLine();

            System.out.print("Enter Last Name of contact to edit: ");
            String editLastName = scanner.nextLine();

            Contacts newContactData = readContactDetails();
            if (addressBook.editContact(editFirstName, editLastName, newContactData)) {
                System.out.println("Contact Updated Successfully");
            } else {
                System.out.println("Contact not found");
            }

            // Remove contact
            if (askYesNo("Do you want to remove a contact? (yes/no): ")) {
                System.out.print("Enter First Name of contact to delete: ");
                String deleteFirstName = scanner.nextLine();

                System.out.print("Enter Last Name of contact to delete: ");
                String deleteLastName = scanner.nextLine();

                if (addressBook.removeContact(deleteFirstName, deleteLastName)) {
                    System.out.println("Contact Deleted..");
                } else {
                    System.out.println("Contact Not Deleted..");
                }
            }
        }
    }

    private static boolean askYesNo(String message) {
        System.out.print(message);
        return scanner.nextLine().equalsIgnoreCase("yes");
    }

    private static Contacts readContactDetails() {
        System.out.println("Enter new contact details:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("State: ");
        String state = scanner.nextLine();
        System.out.print("Zip: ");
        String zip = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        return new Contacts(firstName, lastName, address, city, state, zip, phone, email);
    }
}
