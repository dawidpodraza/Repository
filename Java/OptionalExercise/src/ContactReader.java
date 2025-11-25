import java.io.File;
import java.io.FileNotFoundException;
import java.util.Optional;
import java.util.Scanner;

class ContactReader {


    private static String fileName="contacts.csv";

    static Optional<ContactManager> readFile(String fileName){
        File file = new File(fileName);
        if(!file.exists()){
            return Optional.empty();
        }

        ContactReader.fileName = fileName;
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        ContactManager contactManager = new ContactManager();
            while (scanner.hasNextLine()) {
                Contact contact = createContactFromText(scanner.nextLine());
                contactManager.addContact(contact);
            }
            return Optional.of(contactManager);
    }

    private static Contact createContactFromText(String text) {
        String[] data = text.split(";");
        return new Contact(data[0], data[1], data[2], data[3]);
    }
}