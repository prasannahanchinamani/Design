package addressbook_system.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private List<Contacts> contacts = new ArrayList<>();

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contacts contact) {
        contacts.add(contact);
        System.out.println(contact + " is Added To Contacts");
        System.out.println("Contact Added Succesfully..!");
    }

    public void showAllContacts() {
        for (Contacts contact : contacts) {
            System.out.println(contact+" ");
        }
    }
    public void editContactDetails(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter FirstName");
        String first_name=scanner.nextLine();
        System.out.println("Enter LastName");
        String last_name=scanner.nextLine();
        boolean found = false;
        for (Contacts contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(first_name) &&
                    contact.getLastName().equalsIgnoreCase(last_name)) {

                found = true;

                System.out.println("Editing details for: " + contact);

                System.out.println("Enter new Address:");
                contact.setAddress(scanner.nextLine());

                System.out.println("Enter new City:");
                contact.setCity(scanner.nextLine());

                System.out.println("Enter new State:");
                contact.setState(scanner.nextLine());

                System.out.println("Enter new ZIP Code:");
                contact.setZip(scanner.nextLine());

                System.out.println("Enter new Phone Number:");
                contact.setPhoneNumber(scanner.nextLine());

                System.out.println("Enter new Email:");
                contact.setEmail(scanner.nextLine());

                System.out.println("Contact updated successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found!");
        }
    }
    public void deleteContactDetails(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter FirstName");
        String first_name=scanner.nextLine();
        System.out.println("Enter LastName");
        String last_name=scanner.nextLine();
        boolean found = false;
        for (Contacts contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(first_name) &&
                    contact.getLastName().equalsIgnoreCase(last_name)) {
                found = true;
                contacts.remove(contact);
            }
        }

        if (!found) {
            System.out.println("Contact not found!");
        }
    }

}
