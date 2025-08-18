package com.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<ContactPerson> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(ContactPerson contact) {
        contacts.add(contact);
    }

    public List<ContactPerson> getContacts() {
        return contacts;
    }

    public boolean editContact(String firstName, String lastName, ContactPerson newContactData) {
        for (int i = 0; i < contacts.size(); i++) {
            ContactPerson contact = contacts.get(i);
            if (contact.getFirstName().equalsIgnoreCase(firstName) &&
                    contact.getLastName().equalsIgnoreCase(lastName)) {
                contacts.set(i, newContactData);
                return true;
            }
        }
        return false;
    }

    public boolean deleteContact(String firstName, String lastName) {
        return contacts.removeIf(contact ->
                contact.getFirstName().equalsIgnoreCase(firstName) &&
                        contact.getLastName().equalsIgnoreCase(lastName));
    }


}
