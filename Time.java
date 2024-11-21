import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Time {
    public static void main(String[] args) {
        // List of time zone IDs from the question
        String[] timeZoneIds = {
                "Asia/Aden", "Etc/GMT+9", "Africa/Nairobi", "America/Marigot",
                "Pacific/Honolulu", "Australia/Hobart", "Europe/London", "America/Indiana/Petersburg",
                "Asia/Yerevan", "Europe/Brussels", "GMT", "Chile/Continental", "Pacific/Yap", "CET",
                "Etc/GMT-1", "Canada/Yukon", "Atlantic/St_Helena", "Libya", "US/Pacific-New", "Cuba",
                "Israel", "GB-Eire", "GB", "Mexico/General", "Universal", "Zulu", "Iran", "Navajo",
                "Egypt", "Etc/UTC"
        };

        // Get the current date and time
        ZonedDateTime currentDateTime = ZonedDateTime.now();

        // Print current date and time
        System.out.println("Current Date and Time: " + currentDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
        System.out.println();

        // Display date and time in each time zone
        for (String timeZoneId : timeZoneIds) {
            ZoneId zone = ZoneId.of(timeZoneId);
            ZonedDateTime zonedDateTime = currentDateTime.withZoneSameInstant(zone);
            String zoneName = zone.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
            String formattedDateTime = zonedDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
            System.out.println("Time in " + zoneName + ": " + formattedDateTime);
        }
    }
}
