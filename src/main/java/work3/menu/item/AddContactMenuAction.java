package work3.menu.item;

import lombok.RequiredArgsConstructor;
import work3.menu.MenuAction;
import work3.services.ContactsService;

import java.util.Scanner;

@RequiredArgsConstructor

public class AddContactMenuAction implements MenuAction {
    private final ContactsService contactsService;
    private final Scanner sc;


    @Override
    public void doAction() {
        System.out.println("Create a new contact");
        sc.nextLine();
        System.out.println("Enter your contact");
        String name = sc.nextLine();
        System.out.println("Entered phone number");
        String phone = sc.nextLine();
        contactsService.addContact(name, phone);
    }

    @Override
    public String getName() {
        return "Add contact to list";
    }
}
