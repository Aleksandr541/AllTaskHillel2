package work3.services;

import work3.models.Contact;
import work3.models.ContactsList;

public interface ContactsService {

     void addContact(String name, String phone);
     void removeContact(int index);
     ContactsList<Contact> getAll();
     void searchContact(String name);
     ContactsList<Contact> filter(ContactsList<Contact> contactsList);
}
