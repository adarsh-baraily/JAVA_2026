import java.util.*;
public class calculator {
    public static void main(String[] args) {

        double num1 = 0.0;
        double num2 = 0.0;
        char operator;
        double result = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        num1 = sc.nextDouble();

        System.out.println("Enter number 2 : ");
        num2 = sc.nextDouble();

        System.out.println("Enter the operation to be performed (+,-,/,*,^) : ");
        operator = sc.next().charAt(0);

        switch (operator) {

            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            case '^' -> result = Math.pow(num1,num2);
            default -> System.out.println("Wrong choice");

        }

        System.out.println(result);

        sc.close();


    }
}
