import java.time.LocalDate;
import java.util.Scanner;

public record WeatherData(
        LocalDate localDate,
        double minTemp,
        double maxTemp,
        Unit unit
) {

    enum Unit{
        CELSIUS,
        FAHRENHEIT
    }


}
