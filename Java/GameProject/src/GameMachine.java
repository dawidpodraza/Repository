import java.util.ArrayList;
import java.util.List;

public class GameMachine {
    private List<Game> listOfGames;

    public GameMachine() {
        this.listOfGames = new ArrayList<>();
    }

    public void addGame(Game game){
        listOfGames.add(game);
    }

    public List<Game> getListOfGames(){
        return listOfGames;
    }

    public void buyGame(Game game , double money){

        
//        if(listOfGames.contains(game) && money == game.getPrice()){
//            System.out.println("Zakupiłeś grę :"+game.getTitle());
//            System.out.println("Cena :"+game.getPrice());
//            System.out.println("Reszta "+ (money - game.getPrice()));
//        }else if(listOfGames.contains(game) && money > game.getPrice()){
//            System.out.println("Zakupiłeś grę :"+game.getTitle());
//            System.out.println("Cena :"+game.getPrice());
//            System.out.println("Reszta "+ (money - game.getPrice()));
//        }else if (listOfGames.contains(game) && money < game.getPrice()){
//            System.out.println("Brak pieniędzy");
//            System.out.println("Cena :"+game.getPrice());
//            System.out.println("Twoje pieniądze :" +money);
//        }else{
//            System.out.println("Nie ma takiej gry");
//        }
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
