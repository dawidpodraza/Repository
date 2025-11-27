import java.time.LocalDate;

public record DailyTemp(
        LocalDate data,
        double minTemp,
        double maxTemp,
        Units unit
) {
}
