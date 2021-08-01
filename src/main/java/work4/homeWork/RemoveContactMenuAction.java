package work4.homeWork;

import java.util.List;
import java.util.Scanner;

public class RemoveContactMenuAction implements MenuAction {
    private List<Contact> contactList;
    private Scanner sc;

    public RemoveContactMenuAction(List<Contact> contactList, Scanner sc) {
        this.contactList = contactList;
        this.sc = sc;
    }

    @Override
    public void doAction() {
        new InMemoryContactService(contactList,sc).removeContact();

    }

    @Override
    public String getName() {
        return "Remove contact";
    }

}
