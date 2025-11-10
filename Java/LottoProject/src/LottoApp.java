public class LottoApp {
    static void main(String[] args) {
        Lotto lotto1 = new Lotto();

        lotto1.generateList();
        lotto1.randomize();
        lotto1.addFirstSixNumbersToNewList();
        lotto1.askForSixNumbers();
        lotto1.checkResult();
    }
}
