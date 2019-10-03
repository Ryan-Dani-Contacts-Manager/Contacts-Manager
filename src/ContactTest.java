
public class ContactTest extends ContactActions {

    static Input userInput = new Input();

//    static List<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {

        ContactActions actions = new ContactActions();

       switchCase(actions);

    } //Main()

    public static void switchCase (ContactActions actions) {

            Input sc = new Input();

            actions.userMenu();

            String userInput = sc.getString(" \"Enter an option (1, 2, 3, 4 or 5):");

            if (userInput.equalsIgnoreCase("1")) {
                actions.displayContacts();
              switchCase(actions);

            }else if(userInput.equalsIgnoreCase("2")){
                actions.addContact();
                switchCase(actions);

            }else if(userInput.equalsIgnoreCase("3")){
                actions.searchContact();
                switchCase(actions);

            }else if(userInput.equalsIgnoreCase("4")){
                actions.deleteContact();
                actions.displayContacts();
                switchCase(actions);

            }else if(userInput.equalsIgnoreCase("5")){
                System.out.println("okay..bye");

            } //else if


    } //switchCase()

} //ContactTest Class
