public class Questioner {

    public void askFirstNumber() {
        System.out.println("Podaj pierwszą liczbę:");
    }

    public void askSecondNumber() {
        System.out.println("Podaj drugą liczbę:");
    }

    public void askWhatToDo() {
        System.out.println("Wybierz : dodawanie '+' , odejmowanie '-' , mnożenie '*' , dzielenie '/'");
    }

    public void answer(double result) {
        System.out.println("Wynik działania : " + result);
    }
}
