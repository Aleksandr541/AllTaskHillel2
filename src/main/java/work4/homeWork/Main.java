package work4.homeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        List<Contact> contactList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        List<MenuAction> items = new ArrayList<>();
        items.add(new ReadAllContact(contactList, sc));
        items.add(new AddContactMenuAction(contactList, sc));
        items.add(new RemoveContactMenuAction(contactList, sc));
        items.add(new SearchingForContact(contactList, sc));
        Menu menu = new Menu(sc, items);
        menu.run();


    }
}
