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
}
