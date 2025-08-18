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
}
