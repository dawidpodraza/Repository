package pl.phonebook;

import java.util.NoSuchElementException;

public enum OPTIONS {
    ADD(0,"Dodaj Kontakt"),
    SEARCH_BY_NUMBER(1,"Szukaj po numerze"),
    SEARCH_BY_NAME(2,"Szukaj po nazwie"),
    REMOVE(3,"Usuń"),
    EXIT(4,"Wyjdź");

    private  int optionNumber;
    private String optionDescription;

    OPTIONS(int optionNumber, String optionDescription) {
        this.optionNumber = optionNumber;
        this.optionDescription = optionDescription;
    }

    public int getOptionNumber() {
        return optionNumber;
    }

    public int getOptionNumberByIndex(int optionNumber) {
        if(optionNumber >=values().length || optionNumber < 0){
            throw new NoSuchElementException();
        }
        return values()[optionNumber].optionNumber;
    }

    public static void transformToEnum(){

    }

    @Override
    public String toString() {
        return optionNumber + " " + optionDescription;
    }
}
