import java.util.*;
public class guessthenumber {
    public static void main (String[] args) {

        int number;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 100: ");
        number = sc.nextInt();

        int randomnumber = 0;

        Random rand = new Random();
        int randnumber = rand.nextInt(1, 11);

        if(number >= 1 && number <=10) {
            if(number == randnumber) {
                System.out.println("Congratulations! You guessed the correct number: " + randnumber);
            }
            else {
                System.out.println("Sorry! The correct number was: " + randnumber);
            }
        }
        else {
            System.out.println("Please enter a number between 1 and 10.");
        }
        sc.close();
    }
}
