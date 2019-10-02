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
    public static void main(String[] args) {
//        Contact one = new Contact("dani", "911");

//        HashMap<String, Contact> contacts = new HashMap<>();
        List<Contact> contacts = new ArrayList<>();



        Contact bob = new Contact("bob","298");

            contacts.add(bob);
            Path ContactListPath = Paths.get("src","ContactList.txt");
//            try{
//                Files.write(ContactListPath,contacts);
//            }catch(Exception e){
//                e.printStackTrace();
//            }
        System.out.println(bob.getName());
        }





}
