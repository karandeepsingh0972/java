enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY

}

public class Enumdatatype {
    public static void main(String[] args) {
        Day today = Day.THURSDAY;
        System.out.println("it's Thursday.Work mode!");
        System.out.println("Days of week:");
        for (Day day : Day.values()) {
            System.out.println(day);

        }

        switch (today) {
            case MONDAY:
                System.out.println("Today is : MONDAY");
                break;
            case TUESDAY:
                System.out.println("Today is : TUESDAY");
                break;
            case WEDNESDAY:
                System.out.println("Today is : WEBNESDAY");
                break;
            case THURSDAY:
                System.out.println("Today is : THURSDAY");
                break;
            case FRIDAY:
                System.out.println("Today is : FRIDAY");
                break;
            case SATURDAY:
                System.out.println("Today is : SATURDAY");
                break;
            case SUNDAY:
                System.out.println("Today is : SUNDAY");
                break;
        }
    }
}