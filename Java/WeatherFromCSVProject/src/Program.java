import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {

        String filePath = "weather.csv";
        Logic program1 = new Logic();

        program1.weatherDataList = new ArrayList<>();
        program1.readDataFromFile(filePath);
        program1.runApp();

    }
}
