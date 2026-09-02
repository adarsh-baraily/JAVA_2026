import java.util.*;
public class hypotenuse {
    public static void main() {

        int a = 0;
        int b = 0;
        int h = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of side a: ");
        a = sc.nextInt();

        System.out.println("Enter the length of side b: ");
        b = sc.nextInt();

        h = (int)Math.sqrt((a * a) + (b * b));
        System.out.println("The length of the hypotenuse is: " + h);

        sc.close();


        
    }

}