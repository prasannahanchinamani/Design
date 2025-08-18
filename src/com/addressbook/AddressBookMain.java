package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("WelCome to Address Book!....");


        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Contact Details:");
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
        String phoneNumber = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        Contacts contact = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addressBook.addContact(contact);

        System.out.println("Contact added:");
        System.out.println(contact);

        System.out.print("Do you want to edit a contact? (yes/no): ");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter First Name of contact to edit: ");
            String editFirstName = scanner.nextLine();

            System.out.print("Enter Last Name of contact to edit: ");
            String editLastName = scanner.nextLine();

            System.out.println("Enter new contact details:");
            System.out.print("First Name: ");
            String newFirstName = scanner.nextLine();
            System.out.print("Last Name: ");
            String newLastName = scanner.nextLine();
            System.out.print("Address: ");
            String newAddress = scanner.nextLine();
            System.out.print("City: ");
            String newCity = scanner.nextLine();
            System.out.print("State: ");
            String newState = scanner.nextLine();
            System.out.print("Zip: ");
            String newZip = scanner.nextLine();
            System.out.print("Phone Number: ");
            String newPhone = scanner.nextLine();
            System.out.print("Email: ");
            String newEmail = scanner.nextLine();
            Contacts newcontactdata = new Contacts(newFirstName, newLastName, newAddress,
                    newCity, newState, newZip, newPhone, newEmail);
            if (addressBook.editContact(editFirstName, editLastName, newcontactdata)) {
                System.out.println("Contact Updated Successfully");
            } else {
                System.out.println("Contact not found");
            }

            System.out.print("Do you want to Remove a contact? (yes/no): ");
            String res = scanner.nextLine();
            if (res.equalsIgnoreCase("yes")) {
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
}