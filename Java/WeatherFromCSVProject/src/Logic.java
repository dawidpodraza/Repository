import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Logic {
     public  List<WeatherData> weatherDataList;


    public void runApp(){
       LocalDate userChoice = userDate();
        for (WeatherData weatherData : weatherDataList) {
            if(weatherData.localDate().equals(userChoice)){
                checkDegrees(weatherData,askForDegrees());
            }
        }
        askWhatToDoNext();
    }

    private LocalDate userDate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj date w formacie: RRRR-MM-DD");
        return LocalDate.parse(scanner.nextLine());
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

    private void checkDegrees(WeatherData weatherData , String userChoice){
        if(weatherData.unit().equals(WeatherData.Unit.CELSIUS) && userChoice.equals("1")){
            printStandard(weatherData);
        }else if(weatherData.unit().equals(WeatherData.Unit.FAHRENHEIT) && userChoice.equals("1")){
            printDataWithCelsius(weatherData);
        }else if(weatherData.unit().equals(WeatherData.Unit.CELSIUS) && userChoice.equals("2")){
            printDataWithFahrenheit(weatherData);
        }else if(weatherData.unit().equals(WeatherData.Unit.FAHRENHEIT) && userChoice.equals("2")){
            printStandard(weatherData);
        }else{
            System.out.println(" Coś poszło nie tak");
        }
    }

    private String askForDegrees(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1- CELSIUS    2- FFAHRENHEIT");
        return scanner.nextLine();
    }

    private void printStandard(WeatherData weatherData){
        System.out.println(weatherData.localDate());
        System.out.println(weatherData.minTemp());
        System.out.println(weatherData.maxTemp());
    }

    private void printDataWithCelsius(WeatherData weatherData){
        System.out.println(weatherData.localDate());
        System.out.println((weatherData.minTemp() - 32) / 1.8+(" C"));
        System.out.println((weatherData.maxTemp() - 32) / 1.8+(" C"));
    }
    private void printDataWithFahrenheit(WeatherData weatherData){
        System.out.println(weatherData.localDate());
        System.out.println((weatherData.minTemp() * 9.0 / 5) + 32+(" F"));
        System.out.println((weatherData.maxTemp() * 9.0 / 5) + 32+(" F"));
    }

    public void readDataFromFile(String filePath) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String data;

            while((data=bufferedReader.readLine()) != null){
                String[] parts = data.split(";");
                LocalDate localDate =  LocalDate.parse(parts[0]);
                double minTemp = Double.parseDouble(parts[1]);
                double maxTemp = Double.parseDouble(parts[2]);

                if(parts[3].equals("CELSIUS")){

                    weatherDataList.add(new WeatherData(localDate, minTemp, maxTemp, WeatherData.Unit.CELSIUS));
                }else{
                    weatherDataList.add(new WeatherData(localDate, minTemp, maxTemp, WeatherData.Unit.FAHRENHEIT));
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




}
