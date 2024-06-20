package Java_Utilities.Date.Java_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class Main {
    
    public static void main(String[] args) {
        
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = ld.atTime(lt); 

        ZonedDateTime zdt = ldt.atZone(ZoneId.of("America/Sao_Paulo"));
        
        // Change the time zone and adjust the time instant accordingly
        zdt = zdt.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        // Change the time zone without changing the time instant
        zdt = zdt.withZoneSameLocal(ZoneId.of("Asia/Tokyo"));

        System.out.println("Temporal Adjusters: " + zdt.with(TemporalAdjusters.firstDayOfYear()));

        System.out.println("Day of year: " + zdt.get(ChronoField.DAY_OF_YEAR));

        System.out.println("Time: " + zdt);

    }

}
