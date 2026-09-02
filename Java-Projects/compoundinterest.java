import java.util.*;
public class compoundinterest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount (rs): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = scanner.nextDouble() / 100;
        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of years: ");
        int t = scanner.nextInt();

        double amount = principal * Math.pow(1 + (rate) / n, n * t);
        double compoundInterest = amount - principal;

        System.out.println("The new amount after " + t + " years in (rs) is : " + amount);
        System.out.println("The compound interest in (rs) is : " + compoundInterest);

        scanner.close();
        
    }
}