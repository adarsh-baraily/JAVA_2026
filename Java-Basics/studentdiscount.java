import java.util.*;
public class studentdiscount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean isStudent = true;
        boolean isSenior = false;
        double price = 12.45;

        if(isStudent) {
            if(isSenior) {
                System.out.println("You are eligible for a 20% discount");
                price = price * 0.8;
            } else {
                System.out.println("You are eligible for a 10% discount");
                price = price * 0.9;
            }
        } else {
            System.out.println("You are not eligible for any discount");
        }

        sc.close();

    }
}