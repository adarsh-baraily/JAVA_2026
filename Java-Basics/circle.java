 import java.util.*;
public class circle {
    public static void main(String[] args) {

        double radius = 0;
        double area = 0;
        double circumference = 0;
        double volume = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        radius = sc.nextDouble();

        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;
        volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;

        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);
        System.out.println("The volume of the sphere is: " + volume);

        sc.close();
    }
}