import java.util.*;
public class diceroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times to roll the dice: ");
        int rolls = sc.nextInt();
        rollDice(rolls);
        sc.close();
    }

    static void rollDice(int rolls) {
        Random rand = new Random();
        for (int i = 0; i < rolls; i++) {
            int die1 = rand.nextInt(6) + 1; // Roll for die 1
            int die2 = rand.nextInt(6) + 1; // Roll for die 2
            System.out.println("Roll " + (i + 1) + ": Die 1 = " + die1 + ", Die 2 = " + die2);
        }
    }
}