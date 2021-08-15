package work3.menu.item;

import lombok.RequiredArgsConstructor;
import work3.menu.MenuAction;
import work3.models.Contact;
import work3.models.ContactsList;
import work3.services.ContactsService;

@RequiredArgsConstructor
public class ReadAllContact implements MenuAction {
    private final ContactsService contactsService;


    @Override
    public void doAction() {
        System.out.printf("______________Contacts____________\n");
        ContactsList<Contact> all = contactsService.getAll();
        if (all.getList() == null){
            System.out.println("The list is empty");
        }else {
            for (Contact contact : all.getList()) {
                System.out.printf(
                        "Name:- %s Phone: - %s\n",
                        contact.getName(),
                        contact.getPhone());
            }
        }
        System.out.println("_________________________________");
    }

    @Override
    public String getName() {
        return "Read all contact";
    }

}