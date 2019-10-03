import java.util.HashMap;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContactTest extends ContactActions {



//    static List<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        Input userInput = new Input();

        ContactActions actions = new ContactActions();

        HandleActions handleActions = new HandleActions();

        actions.addContact("Bob", "911");

        String userOption = actions.userMenu(userInput);

        handleActions.switchCase(userOption,userInput,contacts, actions);

    } //Main()

} //ContactTest Class

//    public static void addContact(String userName, String userNumber) {
//
//        Contact newContact = new Contact(userName, userNumber);
//
//        contacts.add(newContact);
//
//        List<String> contactsListString = formatObjectsToStrings(contacts);
//
//        Path ContactListPath = Paths.get("src","ContactList.txt");
//
//        try {
//            Files.write(ContactListPath, contactsListString);
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
//
//
//
//
//    } //addContact()


//    public static List<String> formatObjectsToStrings(List<Contact> contacts) {
//
//        List<String> stringContacts = new ArrayList<>();
//
//        for(Contact person : contacts) {
//            stringContacts.add(person.getNamePhoneNumber());
//        }
//
//        return stringContacts;
//
//    } //formatObjectsToStrings()

//    public static String userMenu (Input scanner) {
//        String menu = "1. View contacts.\n" +
//                "2. Add a new contact.\n" +
//                "3. Search a contact by name.\n" +
//                "4. Delete an existing contact.\n" +
//                "5. Exit.\n";
//        System.out.println(menu);
//        return scanner.getString(" \"Enter an option (1, 2, 3, 4 or 5):");
//
//    } //userMenu()

//    public static void switchCase (String userOptions, Input scanner,List<Contact> contacts, ContactActions actions) {
//        boolean repeat = true;
//        do {
//            if (userOptions.equalsIgnoreCase("1")) {
//                actions.displayContacts(contacts);
//            }else if(userOptions.equalsIgnoreCase("2")){
//
//                String userName = scanner.getString("give a name");
//
//                String  userNumber = scanner.getString("give their number");
//
//                actions.addContact(userName,userNumber);
//
//                actions.userMenu(scanner);
//
//                //Displays user options again
//
//                actions.userMenu(scanner);
//
//                switchCase(userOptions, scanner, contacts, actions);
//
//            }else if(userOptions.equalsIgnoreCase("3")){
//
//                String contactToSearch = scanner.getString("Please enter a name to search for");
//
//                actions.searchContact(contactToSearch);
//
//                //Displays user options again
//
//                actions.userMenu(scanner);
//
//                switchCase(userOptions, scanner, contacts, actions);
//
//            }else if(userOptions.equalsIgnoreCase("4")){
//
//                actions.displayContacts(contacts);
//
//                String contactToDelete = scanner.getString("Enter a name to delete");
//
//                actions.deleteContact(contactToDelete);
//
//                //Displays user options again
//
//                actions.userMenu(scanner);
//
//                switchCase(userOptions, scanner, contacts, actions);
//
//            }else if(userOptions.equalsIgnoreCase("5")){
//                System.out.println("okay..bye");
//                repeat = false;
//            } //else if
//
//        } while(repeat);

//    } //switchCase()

//    public static void deleteContact (String contactToDelete) {
//        List<String> lines = null;
//        try {
//            lines = Files.readAllLines(Paths.get("src", "ContactList.txt"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        } //try/catch
//
//        List<String> newList = new ArrayList<>();
//        for (String line : lines) {
//            if (line.contains(contactToDelete)) {
//                continue;
//            } //if
//            newList.add(line);
//        } //for
//
//        System.out.println(newList);
//
//        try {
//            Files.write(Paths.get("src", "ContactList.txt"), newList);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } //try/catch
//
//
//    } // deleteContact()

//    public static void displayContacts (List<Contact> contacts) {
//        for(Contact contact: contacts){
//            System.out.println(contact.getNamePhoneNumber());
//        } //for
//    } //displayContacts()

//    public static void searchContact(String contactToSearch) {
//        List<String> lines = null;
//        try {
//            lines = Files.readAllLines(Paths.get("src", "ContactList.txt"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        } //try/catch
//
//        for (String line : lines) {
//            if (line.contains(contactToSearch)) {
//                System.out.println(line);
//            } //if
//
//        } //for
//    } //searchContact


