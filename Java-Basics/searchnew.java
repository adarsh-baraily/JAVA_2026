import java.util.*;
public class searchnew {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String target = "apple";
         System.out.print("Enter length of your set of array :");
         int size = sc.nextInt();
         sc.nextLine();
         String[] brands = new String[size];
         
         for(int i = 0; i < brands.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            brands[i] = sc.nextLine();
         }
         
         for(int i = 0; i < brands.length; i++) {
            if(brands[i].equals(target)) {
                System.out.println("The target is found at index:" + i);
                break;
            } else {
                System.out.println("Target not found");
            }
         }

         sc.close();
    }

}


