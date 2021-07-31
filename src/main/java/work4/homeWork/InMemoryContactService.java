package work4.homeWork;

public class InMemoryContactService implements ContactsService {
    ContactsList contactsList = new ContactsList();

    @Override
    public void addContact(Contact contact) {

    }

    @Override
    public void removeContact(int index) {

    }

    @Override
    public ContactsList getAll() {
        return null;
    }
}
