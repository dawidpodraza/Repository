import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {

        //Daj użytkownikowi możliwość wyboru jednostki temperatury między °C i °F.

        //Dane z którego dnia Cię interesują? (format yyyy-MM-dd)
        //2022-11-22
        //W jakiej jednostce wyświetlić pomiary? (C / F)?
        //C
        //Odnaleziony pomiar:
        //Minimalna temperatura dnia 2022-11-22 wynosiła -16.50°C, a maksymalna -11.22°


        String filePath = "weather.csv";
        List<WeatherData> lines = new ArrayList<>();
        Logic logic = new Logic();
        logic.weatherDataList = lines;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String data;

            while((data=bufferedReader.readLine()) != null){
                String[] parts = data.split(";");
                LocalDate localDate =  LocalDate.parse(parts[0]);
                double minTemp = Double.parseDouble(parts[1]);
                double maxTemp = Double.parseDouble(parts[2]);

                if(parts[3].equals("CELSIUS")){

                    lines.add(new WeatherData(localDate, minTemp, maxTemp, WeatherData.Unit.CELSIUS));
                }else{
                    lines.add(new WeatherData(localDate, minTemp, maxTemp, WeatherData.Unit.FAHRENHEIT));
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        logic.runApp();

    }
}
