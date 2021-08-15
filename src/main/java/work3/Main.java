package work3;

import work3.menu.Menu;
import work3.menu.MenuAction;
import work3.menu.item.AddContactMenuAction;
import work3.menu.item.ReadAllContact;
import work3.menu.item.RemoveContactMenuAction;
import work3.menu.item.SearchingForContact;
import work3.services.ContactsService;
import work3.services.InMemoryContactService;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContactsService contactsService = new InMemoryContactService();

        List<MenuAction> item = Arrays.asList(
                new AddContactMenuAction(contactsService, sc),
                new ReadAllContact(contactsService),
                new RemoveContactMenuAction(contactsService,sc),
                new SearchingForContact(contactsService, sc)
        );
        Menu menu = new Menu(sc, item);
        menu.run();

    }
}
