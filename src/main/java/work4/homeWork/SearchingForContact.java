package work4.homeWork;

import java.util.List;
import java.util.Scanner;

public class SearchingForContact implements MenuAction {
    private List<Contact> contactList;
    private Scanner sc;

    public SearchingForContact(List<Contact> contactList, Scanner sc) {
        this.contactList = contactList;
        this.sc = sc;
    }

    @Override
    public void doAction() {
        new InMemoryContactService(contactList,sc).searchContact();
    }

    @Override
    public String getName() {
        return "Searching for contact";
    }
}
