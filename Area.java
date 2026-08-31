import java.util.*;
public class Area {
    public static void main() {



        double width = 0;
        double height = 0;
        double area = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for Width : ");
        width = sc.nextDouble();

        System.out.println("Enter the value for height : ");
        height = sc.nextDouble();

        area = height * width;
        System.out.println("The value of area is : " + area);

        sc.close();








    }
}
