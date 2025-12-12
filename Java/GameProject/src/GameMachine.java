import java.util.List;
import java.util.ArrayList;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.Constants.RESET;
import static java.awt.Color.RED;


public class GameMachine {
    public List<Game> listOfGames;

    public GameMachine() {
        this.listOfGames = new ArrayList<>();
    }

    public void addGame(Game game) {
        listOfGames.add(game);
    }

    public List<Game> getListOfGames() {
        return listOfGames;
    }

    public void buyGame(Game game, double money) {
        try {
            if (!listOfGames.contains(game)) {
                throw new GameNotFoundException("Nie ma takiej gry");
            }else if (listOfGames.contains(game) && money < game.getPrice()) {
                throw new NotEnoughMoneyException("Nie masz wystarczająco pieniędzy");
            }else{
                System.out.println("Zakupiłeś grę :" + game.getTitle());
                System.out.println("Cena :" + game.getPrice());
                System.out.println("Reszta " + (money - game.getPrice()));
            }

        }catch (GameNotFoundException | NotEnoughMoneyException e){
            System.out.println(e.getMessage());
        }

    }

    public Game checkInList(String title) {
        boolean check = false;
        Game game = null;
        for (Game listOfGame : listOfGames) {
            if (listOfGame.getTitle().equals(title))
                game = listOfGame;
        }
        return game;
    }

}




