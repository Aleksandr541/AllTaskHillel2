package work4.homeWork;

import java.util.List;
import java.util.Scanner;

public class ReadAllContact implements MenuAction {

    private List<Contact> contactList;
    private Scanner sc;

    public ReadAllContact(List<Contact> contactList, Scanner sc) {
        this.contactList = contactList;
        this.sc = sc;
    }

    @Override
    public void doAction() {

        new InMemoryContactService(contactList,sc).getAll();

    }

    @Override
    public String getName() {
        return "Read all contact";
    }

}
