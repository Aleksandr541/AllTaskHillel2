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
        sc.nextLine();
        System.out.println("Entered name");
        String name = sc.nextLine();
        System.out.println("Entered number phone");
        String phone = sc.nextLine();
        Contact contact = new Contact(name, phone);
        contactList.add(contact);
    }

    @Override
    public String getName() {
        return "Add contact to list";
    }
}
