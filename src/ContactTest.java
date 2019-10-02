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
        Input userInput = new Input();


    addContact("Bob", "911");
    addContact("Ryan", "093284");
    addContact("Daniel", "93028343");
    String userOption = userMenu(userInput);
    switchCase(userOption,userInput);


//        String userName = userInput.getString("give a name");
//        String  userNumber = userInput.getString("give their number");


    } //Main()


    public static void addContact(String userName, String userNumber) {

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

    public static String userMenu (Input scanner) {
        String menu = "1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n";
        System.out.println(menu);
        return scanner.getString(" \"Enter an option (1, 2, 3, 4 or 5):");

    }

    public static void switchCase (String userOptions, Input scanner) {
        if (userOptions.equalsIgnoreCase("1")) {

            System.out.println("you chose 1");
        }else if(userOptions.equalsIgnoreCase("2")){
            String userName = scanner.getString("give a name");
            String  userNumber = scanner.getString("give their number");
            addContact(userName,userNumber);
        }

    }

} //ContactTest Class
