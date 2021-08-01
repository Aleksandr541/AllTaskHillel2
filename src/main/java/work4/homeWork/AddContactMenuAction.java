package work4.homeWork;

import java.util.List;
import java.util.Scanner;

public class AddContactMenuAction implements MenuAction {
    private List<Contact> contactList;
    private Scanner sc;

    public AddContactMenuAction(List<Contact> contactList, Scanner sc) {
        this.contactList = contactList;
        this.sc = sc;
    }

    @Override
    public void doAction() {
        new InMemoryContactService(contactList,sc).addContact();
    }

    @Override
    public String getName() {
        return "Add contact to list";
    }
}
