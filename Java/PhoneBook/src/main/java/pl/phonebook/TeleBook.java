package pl.phonebook;

import java.util.ArrayList;
import java.util.List;

public class TeleBook {

    private List<Contact> contacts = new ArrayList<>();


//    public TeleBook(List<Contact> contacts) {
//        this.contacts = new ArrayList<>();
//    }

    public TeleBook() {
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public void searchContactByName(List<Contact> contacts, String name) {
        boolean found = false;
        Contact contact = null;
        for (Contact contact1 : contacts) {

            if (contact1.getName().equals(name)) {
                found = true;
                contact = contact1;
            }
        }
        if (found) {
            System.out.println(contact.toString());
        } else {
            System.out.println("Contact not found");
        }
    }

}
