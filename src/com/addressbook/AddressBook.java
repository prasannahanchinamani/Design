package com.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<Contacts> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contacts contact) {
        contacts.add(contact);
    }

    public boolean editContact(String first_name, String last_name, Contacts newData) {
        for (int i = 0; i < contacts.size(); i++) {
            Contacts contact = contacts.get(i);
            if (contact.getFirstName().equalsIgnoreCase(first_name) &&
                    contact.getLastName().equalsIgnoreCase(last_name)) {
                return true;
            }
        }
        return false;
    }
}
