import java.util.*;
public class time {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the time in 24-hour format : ");
        int time = sc.nextInt();

        String timeOfDay = (time >= 0 && time < 12) ? "AM" : "PM";

        System.out.println(timeOfDay);

        sc.close();


    }
}