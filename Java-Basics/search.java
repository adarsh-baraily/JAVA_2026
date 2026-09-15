import java.util.*;
public class search {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int target = 5;
         System.out.print("Enter length of your set of array :");
         int size = sc.nextInt();
         int[] numbers = new int[size];
         
         for(int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            numbers[i] = sc.nextInt();
         }
         
         for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == target) {
                System.out.println("The target is found at index:" + i);
                break;
            } else {
                System.out.println("Target not found");
            }
         }

         sc.close();
    }

}

