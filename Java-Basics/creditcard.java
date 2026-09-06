import java.util.*;
public class creditcard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age to check eligibility for a credit card: ");
        int age = sc.nextInt();

        if(ageCheck(age)){
            System.out.println("You are eligible for a credit card.");
        } else {
            System.out.println("You are not eligible for a credit card.");
        }

        sc.close();
    
    }
    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
