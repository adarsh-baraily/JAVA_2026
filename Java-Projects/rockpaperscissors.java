import java.util.*;

public class rockpaperscissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] game = {"rock", "paper", "scissors"};
        String compch;
        String userch;
        String retry = " ";
        

        do {

            System.out.println("Enter either rock, paper or scissors:");
            userch = sc.nextLine().toLowerCase();

            // Check for invalid input
            if (!userch.equals("rock") && 
                !userch.equals("paper") && 
                !userch.equals("scissors")) {
                 System.out.println("Invalid choice!");
                continue;
            }

            // Computer's choice
            compch = game[rand.nextInt(3)];

            System.out.println("Computer's choice is: " + compch);

            // Decide winner
            if (compch.equals(userch)) {
                System.out.println("It's a draw!");
            } else if (compch.equals("rock") && userch.equals("paper")) {
                System.out.println("You win!");

            } else if (compch.equals("paper") && userch.equals("scissors")) {
                System.out.println("You win!");

            } else if (compch.equals("scissors") && userch.equals("rock")) {
                System.out.println("You win!");

            } else {
                System.out.println("Computer wins!");
            }

            System.out.println("Do you want to play again? (yes/no)");
            retry = sc.nextLine().toLowerCase();

        } while (retry.equals("yes"));

        System.out.println("Thanks for playing!");
        sc.close();
    }
}