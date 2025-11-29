import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Logic {
     public List<WeatherData> weatherDataList;

    private LocalDate userDate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj date w formacie: RRRR-MM-DD");
        return LocalDate.parse(scanner.nextLine());
    }

    public void runApp(){
       LocalDate userChoice = userDate();

        for (WeatherData weatherData : weatherDataList) {
            if(weatherData.localDate().equals(userChoice)){
                System.out.println(weatherData.localDate());
                System.out.println(weatherData.minTemp());
                System.out.println(weatherData.maxTemp());
                System.out.println(weatherData.unit());
            }
        }
        askWhatToDoNext();



    }

    private void askWhatToDoNext(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Co chcesz robić dalej :\n1 = kolejna data do sprawdzenia\n2 = wyjście z programu");
        String choice = scanner.nextLine();

        switch(choice){
            case "1" -> runApp();
            case "2" -> System.exit(0);
        }
    }
}
