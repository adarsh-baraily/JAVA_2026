import java.time.*;
import java.time.format.*;
import java.util.*;
public class customdatetime {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy || HH:mm:ss");

        String newdt = dt.format(formatter);

        System.out.println("The current Day and Time in custom format is : " + newdt);

    }
    
}
