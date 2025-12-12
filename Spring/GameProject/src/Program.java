public class Program {
    static void main(String[] args) {
        GameMachine machine = new GameMachine();
        machine.addGame(new Game("Witcher III",150));
        machine.addGame(new Game("Cyberpunk 2077",170));
        machine.addGame(new Game("Midnight",300));

        GameMachineController controller = new GameMachineController();
        Game userChoice = machine.checkInList(controller.askForTitle());
        double userMoney = controller.askForPrice();

        machine.buyGame(userChoice,userMoney);

    }

    /* przerobić program na rzucanie wyjątków */
}
