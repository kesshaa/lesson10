import java.util.ArrayList;
import java.util.List;

class ContactBook<T extends Contact> {
    private final List<T> contacts = new ArrayList<>();

    public void addContact(T contact) {
        contacts.add(contact);
    }

    public void printList() {
        for (T contact : contacts) {
            System.out.println(contact.getName());
        }
    }

    public void congratulate(String name) {
        for (T contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println(contact.getCongratulation());
                return;
            }
        }
        System.out.println("Контакт не найден.");
    }
}