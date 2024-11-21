import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Duration;

public class timepackage2 {
    public static void main(String[] args) {
        // Local Time
        LocalTime localTime = LocalTime.now();
        System.out.println("Current Local Time: " + localTime);

        // Local Date and Time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current Local Date and Time: " + localDateTime);

        // Period
        LocalDate date1 = LocalDate.of(2022, 1, 1);
        LocalDate date2 = LocalDate.of(2023, 1, 1);
        Period period = Period.between(date1, date2);
        System.out.println("Period: " + period.getYears() + " years, " + period.getMonths() + " months, "
                + period.getDays() + " days");

        // Duration
        LocalDateTime dateTime1 = LocalDateTime.of(2022, 1, 1, 12, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2022, 1, 1, 13, 0, 0);
        Duration duration = Duration.between(dateTime1, dateTime2);
        System.out.println("Duration: " + duration.toHours() + " hours, " + duration.toMinutes() + " minutes, "
                + duration.toSeconds() + " seconds");

        // Period of Day
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.of(6, 0)) && time.isBefore(LocalTime.of(12, 0))) {
            System.out.println("Good Morning!");
        } else if (time.isAfter(LocalTime.of(12, 0)) && time.isBefore(LocalTime.of(18, 0))) {
            System.out.println("Good Afternoon!");
        } else if (time.isAfter(LocalTime.of(18, 0)) && time.isBefore(LocalTime.of(22, 0))) {
            System.out.println("Good Evening!");
        } else {
            System.out.println("Good Night!");
        }
    }
}