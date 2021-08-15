package work3.services;

import work3.models.Contact;
import work3.models.ContactsList;
import work3.utils.ListUtils;

import java.util.Objects;

public class InMemoryContactService implements ContactsService {
    private ContactsList<Contact> contactsList = new ContactsList<>();

    @Override
    public void addContact(String name, String phone) {
        contactsList.add(new Contact(name, phone));
    }

    @Override
    public void removeContact(int index) {
        contactsList.remove(index);
    }

    @Override
    public ContactsList<Contact> getAll() {
        return contactsList;
    }

    @Override
    public void searchContact(String name) {
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getName().equals(name)) {
                System.out.println(contactsList.get(i));
            }
        }

    }

    @Override
    public ContactsList<Contact> filter(ContactsList<Contact> contactsList){
        return ListUtils.filter(contactsList, Objects::nonNull);
    }
}
