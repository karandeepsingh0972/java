import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Duration;

public class timepack {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("Current Local Time:" + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current localdatetime:" + localDateTime);

        LocalDate localDate = LocalDate.now();
        System.out.println("Current Local Date:" + localDate);

        LocalDate date1 = LocalDate.of(2022, 05, 06);
        LocalDate date2 = LocalDate.of(2024, 1, 4);
        Period period = Period.between(date1, date2);
        System.out.println(
                "Period: " + period.getYears() + "Year-" + period.getMonths() + "Month-" + "Day-" + period.getDays());

        LocalDate dateTime1 = LocalDate.of(2022, 05, 06);
        LocalDate dateTime2 = LocalDate.of(2024, 1, 4);
        Duration duration = Duration.between(date1, date2);

    }

}
