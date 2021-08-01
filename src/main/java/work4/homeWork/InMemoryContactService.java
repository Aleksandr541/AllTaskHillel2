package work4.homeWork;

import java.util.List;
import java.util.Scanner;

public class InMemoryContactService implements ContactsService {
    private List<Contact> contactList;
    private Scanner sc;

    public InMemoryContactService(List<Contact> contactList, Scanner sc) {
        this.contactList = contactList;
        this.sc = sc;
    }

    @Override
    public void addContact() {
        sc.nextLine();
        System.out.println("Entered name");
        String name = sc.nextLine();
        System.out.println("Entered number phone");
        String phone = sc.nextLine();
        contactList.add(new Contact(name, phone));
    }

    @Override
    public void removeContact() {
        sc.nextLine();
        System.out.println("Enter index remove");
        int numberRemove = sc.nextInt();
        contactList.remove(numberRemove - 1);
    }

    @Override
    public ContactsList getAll() {
        System.out.println("");
        System.out.println("Your contacts");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.printf("%d %s\n", i + 1, contactList.get(i));
        }
        System.out.println("");
        return null;
    }

    @Override
    public void searchContact() {
        sc.nextLine();
        System.out.println("Search contact entered");
        String search = sc.nextLine();
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getName().equals(search)) {
                System.out.println(contactList.get(i));
            }
        }
    }
}
