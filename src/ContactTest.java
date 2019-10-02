import java.util.HashMap;

public class ContactTest {
    public static void main(String[] args) {
        Contact one = new Contact("dani","911");

        HashMap<String, Contact> contacts = new HashMap<>();
        addContact("dani","210", contacts);
//        System.out.println(contacts.);
        for(String contact : contacts.keySet()) {
                System.out.println(contacts.get(contact).getPhoneNumber());
            }
        }

    public static void  addContact (String name, String number, HashMap contacts) {
        contacts.put("contact", new Contact(name,number));
    }
}
