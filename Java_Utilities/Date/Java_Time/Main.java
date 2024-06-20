package Java_Utilities.Date.Java_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    
    public static void main(String[] args) {
        
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = ld.atTime(lt); 

        ZonedDateTime zdt = ldt.atZone(ZoneId.of("America/Sao_Paulo"));
        
        // Change the date
        zdt = zdt.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        // Change the zone
        zdt = zdt.withZoneSameLocal(ZoneId.of("Asia/Tokyo"));
    }

}
