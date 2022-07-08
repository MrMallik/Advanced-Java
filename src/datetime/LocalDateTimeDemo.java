package datetime;

import java.time.*;
import java.util.Map;

public class LocalDateTimeDemo {

    public static void calculateAge(LocalDate dob){
        Period age = Period.between(dob, LocalDate.now());
        System.out.println("Age is : " + age.getYears() +
                "years, " + age.getMonths() + "months, " +
                age.getDays() + "days");
    }

    public static void printTime(LocalDateTime localDateTime, String zone){
        System.out.println("Time at " + zone + " " + localDateTime.getHour() + ":" +
                localDateTime.getMinute() + ":" +
                localDateTime.getSecond());
    }

    public static void main(String[] args) {
        String zone = "Asia/Kolkata";
//        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of(zone));

//        printTime(localDateTime, zone);
//        printTime(localDateTime.plusMinutes(20), zone);

//        System.out.println(localDateTime.getDayOfWeek());

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zone));

        calculateAge(LocalDate.of(1999,9,20));

    }
}
