import java.util.*;
public class enhancedswitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day : "); 
        String day = sc.nextLine();

        switch(day) {

            case "Monday" , "Tuesday" , "Wednesday", "Thursday", "Friday" -> System.out.println("It is a Weekday");
            case "Saturday", "Sunday" -> System.out.println("It is a weekend day");
         


        }
        sc.close();
    }
    
}
