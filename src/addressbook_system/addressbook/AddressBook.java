package addressbook_system.addressbook;

import java.util.ArrayList;
import java.util.List;

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

}
