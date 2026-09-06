import java.util.*;
public class countdown {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to start countdown from : ");
        int number = sc.nextInt();
        for (int i = number; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000); // Sleep for 1 second
        }

        System.out.println("Countdown finished!");
        sc.close();
    }

}