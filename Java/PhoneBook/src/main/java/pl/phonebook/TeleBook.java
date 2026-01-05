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

    public void addContact(String name, int number) {
        contacts.add(new Contact(name, number));
    }

    public void removeContact(String name, int number) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name) || contacts.get(i).getNumber() == number) {
                contacts.remove(i);
            }
        }
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

    public void searchContactByNumber(List<Contact> contacts, int number) {
        boolean found = false;
        Contact contact = null;
        for (Contact contact1 : contacts) {

            if (contact1.getNumber()==number) {
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
