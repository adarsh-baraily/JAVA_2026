import java.util.*;
public class banking {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double balance = 0;
        int choice = 0;

        while(true) {
            
            System.out.println("WELCOME TO THE BANKING SYSTEM");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter amount to deposit in $: ");
                    double depositAmount = sc.nextDouble();
                    balance += depositAmount;
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw in $: ");
                    double withdrawAmount = sc.nextDouble();
                    if(withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 3:
                    System.out.println("Current Balance: $" + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the banking system !");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");


            }
        }


        
    }
    
}
