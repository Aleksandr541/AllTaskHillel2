package work4.homeWork;

public interface ContactsService {

    public void addContact(Contact contact);

    public void removeContact(int index);

    public ContactsList getAll();
}
