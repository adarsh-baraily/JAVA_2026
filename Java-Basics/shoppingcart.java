import java.util.*;
public class shoppingcart {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantity;
        double price, total;
        String item;

        System.out.println("Enter item name: ");
        item = sc.nextLine();

        System.out.println("Enter quantity: ");
        quantity = sc.nextInt();

        System.out.println("Enter price (rs): ");
        price = sc.nextDouble();

        total = quantity * price;

        System.out.println("The total cost is (rs) " + total);

        sc.close();

    }
}