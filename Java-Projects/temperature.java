import java.util.*;
public class temperature {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        double newtemp = 0;
        double temp = 0;
        String unit = " ";

        System.out.print("Enter the temperature : ");
        temp = scanner.nextDouble();

        System.out.print("Enter the unit to convert into (C/F) : ");
        unit = scanner.next().toUpperCase();

        newtemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp *9/5) + 32;

        System.out.println("The converted temperature is : " + newtemp + " " + unit);

        scanner.close();

    }
}
