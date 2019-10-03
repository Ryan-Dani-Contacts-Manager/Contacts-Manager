import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ContactActions  {

    static List<Contact> contacts = new ArrayList<>();

    public void addContact(String userName, String userNumber) {

        Contact newContact = new Contact(userName, userNumber);

        contacts.add(newContact);

        List<String> contactsListString = formatObjectsToStrings(contacts);

        Path ContactListPath = Paths.get("src","ContactList.txt");

        try {
            Files.write(ContactListPath, contactsListString);
        } catch(IOException e) {
            e.printStackTrace();
        }




    } //addContact()

    public static List<String> formatObjectsToStrings(List<Contact> contacts) {

        List<String> stringContacts = new ArrayList<>();

        for(Contact person : contacts) {
            stringContacts.add(person.getNamePhoneNumber());
        }

        return stringContacts;

    } //formatObjectsToStrings()
}
