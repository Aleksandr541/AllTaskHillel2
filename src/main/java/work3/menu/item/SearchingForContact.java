package work3.menu.item;

import lombok.RequiredArgsConstructor;
import work3.menu.MenuAction;
import work3.services.ContactsService;

import java.util.Scanner;

@RequiredArgsConstructor
public class SearchingForContact implements MenuAction {
    private final ContactsService contactsService;
    private final Scanner sc;

    @Override
    public void doAction() {
        sc.nextLine();
        System.out.printf("Enter the contact name:\n");
        String name = sc.nextLine();
        System.out.printf("Contact searching...");
        contactsService.searchContact(name);
    }

    @Override
    public String getName() {
        return "Searching for contact";
    }

}
