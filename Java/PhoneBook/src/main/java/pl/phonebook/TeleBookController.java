package pl.phonebook;

import java.util.Scanner;

public class TeleBookController {
    private TeleBook teleBook = new TeleBook();
    private Scanner scanner = new Scanner(System.in);

    public void loop(){
           showOptions();
           executeOption(chooseOption());

    }

    private void showOptions(){
        System.out.println("0 - dodaj kontakt");
        System.out.println("1 - szukaj po numerze");
        System.out.println("2 - szukaj po nazwie");
        System.out.println("3 - usuń");
        System.out.println("4 - wyjdź");
    }

    private OPTIONS chooseOption(){
        int option = scanner.nextInt();
        return  OPTIONS.values()[option];
    }

    private void executeOption(OPTIONS options) {
        switch (options){
            case ADD:
                scanner.nextLine();
                System.out.println("Podaj nazwe:");
                String name = scanner.nextLine();
                System.out.println("Podaj nr telefonu:");
                int number = scanner.nextInt();
                teleBook.addContact(name, number);
                break;

            case REMOVE:
                scanner.nextLine();
                System.out.println("Podaj nazwe:");
                String nameToRemove = scanner.nextLine();
                System.out.println("Podaj nr telefonu:");
                int numberToRemove = scanner.nextInt();
                teleBook.removeContact(nameToRemove, numberToRemove);
                break;

            case SEARCH_BY_NAME:
                scanner.nextLine();
                System.out.println("Podaj nazwe:");
                String nameToSearch = scanner.nextLine();
                teleBook.searchContactByName(teleBook.getContacts(), nameToSearch);
                break;

            case SEARCH_BY_NUMBER:
                scanner.nextLine();
                System.out.println("Podaj nr telefonu:");
                int numberToSearch = scanner.nextInt();
                teleBook.searchContactByNumber(teleBook.getContacts(), numberToSearch);
                break;
            case EXIT:
                break;

        }
    }

}
