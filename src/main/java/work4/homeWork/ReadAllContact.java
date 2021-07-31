package work4.homeWork;

import java.util.List;

public class ReadAllContact implements MenuAction {
    private List<Contact> contactList;

    public ReadAllContact(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public void doAction() {

        for (int i = 0; i < contactList.size(); i++) {
            System.out.printf("%d %s\n", i + 1, contactList.get(i));
        }

    }

    @Override
    public String getName() {
        return "Read all contact";
    }

}
