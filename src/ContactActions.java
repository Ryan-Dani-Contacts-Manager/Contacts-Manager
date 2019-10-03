import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ContactActions  {

    static Input userInput = new Input();

    Format formatObjects = new Format();

    static List<Contact> contacts = new ArrayList<>();

    public void addContact() {

        Input sc = new Input();

        String userName = sc.getString("give a name");

        String  userNumber = sc.getString("give their number");

        Contact newContact = new Contact(userName, userNumber);

        contacts.add(newContact);

        List<String> contactsListString = formatObjects.formatObjectsToStrings(contacts);

        Path ContactListPath = Paths.get("src","ContactList.txt");

        try {
            Files.write(ContactListPath, contactsListString, StandardOpenOption.APPEND);
        } catch(IOException e) {
            e.printStackTrace();
        } //try/catch

    } //addContact()

    public void displayContacts () {

        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("src", "ContactList.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        } //try/catch

        for (String line : lines) {
            System.out.println(line);

        } //for
    } //displayContacts()

    public void searchContact() {
        Input sc = new Input();
        String searchName = sc.getString("give a name to search");
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("src", "ContactList.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        } //try/catch

        for (String line : lines) {
            if (line.contains(searchName)) {
                System.out.println(line);
            } //if

        } //for
    } //searchContact

    public void deleteContact () {
        Input sc = new Input();
        String deletedContact = sc.getString("give a name to delete");
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("src", "ContactList.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        } //try/catch

        List<String> newList = new ArrayList<>();
        for (String line : lines) {
            if (line.contains(deletedContact)) {
                continue;
            } //if
            newList.add(line);
        } //for

        try {
            Files.write(Paths.get("src", "ContactList.txt"), newList);
        } catch (IOException e) {
            e.printStackTrace();
        } //try/catch


    } // deleteContact()

    public void userMenu () {
        String menu = "1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n";
        System.out.println(menu);

    } //userMenu()

} //ContactActions Class

