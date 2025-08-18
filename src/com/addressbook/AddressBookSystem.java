package com.addressbook;

import java.util.HashMap;
import java.util.Map;

public class AddressBookSystem {

    private Map<String, AddressBook> addressBooks;

    public AddressBookSystem() {
        addressBooks = new HashMap<>();
    }

    public boolean addAddressBook(String name) {
        if (addressBooks.containsKey(name))
            return false;
        addressBooks.put(name, new AddressBook());
        return true;
    }

    public AddressBook getAddressBook(String name) {
        return addressBooks.get(name);
    }

    public Map<String, AddressBook> getAllAddressBooks() {
        return addressBooks;
    }
}
