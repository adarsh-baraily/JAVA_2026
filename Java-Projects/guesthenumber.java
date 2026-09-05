import java.util.*;
public class guesthenumber {
    public static void main(String[] args) {

        Random rand = new Random();

        int attempts = 0;
        int number = 0;
        int random = rand.nextInt(1, 11);

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I have selected a random number between 1 and 10. Can you guess it?");
        System.out.println("If interested , Enter your guess (1-10): ");


        do {

            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();

            if(number < random) {
                System.out.println("Your guess is too low. Try again!");
                attempts++;
            } else if (number > random) {
                System.out.println("Your guess is too high. Try again!");
                attempts++;
            } else {
                System.out.println("Congratulations! You guessed the number correctly.");
                System.out.println("It took you " + attempts + " attempts to guess the number.");
            }

        } while (number != random);

        
    }
    
}
