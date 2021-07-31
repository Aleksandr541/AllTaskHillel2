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
        sc.nextLine();
        System.out.println("Search contact entered");
        String search = sc.nextLine();
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getName().equals(search)) {
                System.out.println(contactList.get(i));
            }
        }

    }

    @Override
    public String getName() {
        return "Searching for contact";
    }
}
