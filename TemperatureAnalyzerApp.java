import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TemperatureAnalyzerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int numDays = scanner.nextInt();
        double[] temperatures = new double[numDays];

        // Input temperatures
        System.out.println("Enter the temperatures for " + numDays + " days:");
        for (int i = 0; i < numDays; i++) {
            temperatures[i] = scanner.nextDouble();
        }

        // Calculate average temperature
        double averageTemp = TemperatureAnalyzer.calculateAverage(temperatures);
        System.out.printf("Average Temperature: %.2f%n", averageTemp);

        // Find days above average
        List<Integer> aboveAverageDays = TemperatureAnalyzer.findDaysAboveAverage(temperatures, averageTemp);
        System.out.println("Days above average temperature: " + aboveAverageDays);

        // Download results
        System.out.println("Do you want to download the results? (yes/no)");
        String response = scanner.next();
        if (response.equalsIgnoreCase("yes")) {
            FileManager.downloadResults(averageTemp, aboveAverageDays);
            System.out.println("Results downloaded successfully.");
        }

        scanner.close();
    }
}

class TemperatureAnalyzer {
    public static double calculateAverage(double[] temperatures) {
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        return sum / temperatures.length;
    }

    public static List<Integer> findDaysAboveAverage(double[] temperatures, double average) {
        List<Integer> aboveAverageDays = new ArrayList<>();
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > average) {
                aboveAverageDays.add(i + 1); // Day index starting from 1
            }
        }
        return aboveAverageDays;
    }
}

class FileManager {
    public static void downloadResults(double averageTemp, List<Integer> aboveAverageDays) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("temperature_report.txt"))) {
            writer.write("Average Temperature: " + averageTemp + "\n");
            writer.write("Days Above Average Temperature: " + aboveAverageDays + "\n");
        } catch (IOException e) {
            System.out.println("Error while downloading results: " + e.getMessage());
        }
    }
}
