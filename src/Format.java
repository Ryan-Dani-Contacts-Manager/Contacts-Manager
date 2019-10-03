import java.util.ArrayList;
import java.util.List;

public class Format {
    public List<String> formatObjectsToStrings(List<Contact> contacts) {

        List<String> stringContacts = new ArrayList<>();

        for(Contact person : contacts) {
            stringContacts.add(person.getNamePhoneNumber());
        }

        return stringContacts;

    } //formatObjectsToStrings()
}
