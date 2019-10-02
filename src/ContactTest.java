import java.util.HashMap;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContactTest {

    static List<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {



    addContact("Bob", "911");
    addContact("Ryan", "093284");
    addContact("Daniel", "93028343");




    } //Main()


    public static void addContact(String name, String phoneNumber) {

        Contact newContact = new Contact(name, phoneNumber);

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
} //ContactTest Class
