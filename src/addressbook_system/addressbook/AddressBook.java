package addressbook_system.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contacts> contacts=new ArrayList<>();
    public void addContact(Contacts contact){
        contacts.add(contact);
        System.out.println(contact+" is Added To Contacts");
    }
    public List<Contacts> getAllContancts(){
        return contacts;
    }
}
