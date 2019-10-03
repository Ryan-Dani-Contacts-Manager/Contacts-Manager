import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ContactActions  {

    Format formatObjects = new Format();

    static List<Contact> contacts = new ArrayList<>();

    public void addContact(String userName, String userNumber) {

        Contact newContact = new Contact(userName, userNumber);

        contacts.add(newContact);

        List<String> contactsListString = formatObjects.formatObjectsToStrings(contacts);

        Path ContactListPath = Paths.get("src","ContactList.txt");

        try {
            Files.write(ContactListPath, contactsListString);
        } catch(IOException e) {
            e.printStackTrace();
        } //try/catch

    } //addContact()

    public void displayContacts (List<Contact> contacts) {
        System.out.println("display");
        for(Contact contact: contacts){
            System.out.println(contact.getNamePhoneNumber());
        } //for
    } //displayContacts()

    public void searchContact(String contactToSearch) {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("src", "ContactList.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        } //try/catch

        for (String line : lines) {
            if (line.contains(contactToSearch)) {
                System.out.println(line);
            } //if

        } //for
    } //searchContact

    public void deleteContact (String contactToDelete) {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("src", "ContactList.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        } //try/catch

        List<String> newList = new ArrayList<>();
        for (String line : lines) {
            if (line.contains(contactToDelete)) {
                continue;
            } //if
            newList.add(line);
        } //for

        System.out.println(newList);

        try {
            Files.write(Paths.get("src", "ContactList.txt"), newList);
        } catch (IOException e) {
            e.printStackTrace();
        } //try/catch


    } // deleteContact()

    public String userMenu (Input scanner) {
        String menu = "1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n";
        System.out.println(menu);
        return scanner.getString(" \"Enter an option (1, 2, 3, 4 or 5):");

    } //userMenu()

} //ContactActions Class

