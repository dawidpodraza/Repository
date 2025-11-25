import java.util.Optional;
import java.util.Scanner;

class ContactApp {
    public static void main(String[] args) {
        Optional<ContactManager> contactManager = ContactReader.readFile("contacts.csv");
        if(contactManager.isEmpty()){
            System.out.println("Nie ma pliku takiego");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres email do wyszukania kontaktu:");
        String email = scanner.nextLine();
        Optional<Contact> contactByEmail = contactManager.flatMap(manager -> manager.findByEmail(email));
        System.out.println("Kontakt o wskazanym adresie email:");
        contactByEmail.ifPresentOrElse(
                x-> System.out.println(x.getLastName()),
                        ()-> System.out.println("Nie ma takiego kontaktu")
        );
    }
}

// zrobione ale nie zrozumiane do konca zadanie do powtorki