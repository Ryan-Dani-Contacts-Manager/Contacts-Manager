import java.util.List;

public class HandleActions {

    public void switchCase(String userOptions, Input scanner, List<Contact> contacts, ContactActions actions) {
        boolean repeat = true;
        do {
            if (userOptions.equalsIgnoreCase("1")) {

                actions.displayContacts(contacts);

                //Displays user options again

                actions.userMenu(scanner);

                switchCase(userOptions, scanner, contacts, actions);

            } else if (userOptions.equalsIgnoreCase("2")) {

                String userName = scanner.getString("give a name");

                String userNumber = scanner.getString("give their number");

                actions.addContact(userName, userNumber);

                actions.userMenu(scanner);

                //Displays user options again

                actions.userMenu(scanner);

                switchCase(userOptions, scanner, contacts, actions);

            } else if (userOptions.equalsIgnoreCase("3")) {

                String contactToSearch = scanner.getString("Please enter a name to search for");

                actions.searchContact(contactToSearch);

                //Displays user options again

                actions.userMenu(scanner);

                switchCase(userOptions, scanner, contacts, actions);

            } else if (userOptions.equalsIgnoreCase("4")) {

                actions.displayContacts(contacts);

                String contactToDelete = scanner.getString("Enter a name to delete");

                actions.deleteContact(contactToDelete);

                //Displays user options again

                actions.userMenu(scanner);

                switchCase(userOptions, scanner, contacts, actions);

            } else if (userOptions.equalsIgnoreCase("5")) {
                System.out.println("okay..bye");
                repeat = false;
            } //else if

        } while (repeat);
    } //switchCase()

} //HandleActions Class
