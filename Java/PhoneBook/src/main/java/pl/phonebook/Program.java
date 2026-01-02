package pl.phonebook;

public class Program {
    public static void main(String[] args) {
        TeleBook teleBook = new TeleBook();

        teleBook.addContact(new Contact("Gabi",734453123));
        teleBook.addContact(new Contact("Mariusz",876453123));
        teleBook.addContact(new Contact("Kmil",734432123));

        teleBook.searchContactByName(teleBook.getContacts(),"Mariusz");
        teleBook.searchContactByNumber(teleBook.getContacts(),734453123);

    }
    //Zrobic kolejna metode to wyszkuiwania po numerze telefonu i wydzielic metody do prostych czynnosci
}
