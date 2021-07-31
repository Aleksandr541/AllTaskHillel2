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
        sc.nextLine();
        System.out.println("Enter index remove");
        int numberRemove = sc.nextInt();
        contactList.remove(numberRemove - 1);

    }

    @Override
    public String getName() {
        return "Remove contact";
    }

}
