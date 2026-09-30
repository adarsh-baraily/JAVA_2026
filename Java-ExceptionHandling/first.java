import java.util.*;
public class first {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter your choice of number :");
            int n = sc.nextInt();


        }
        catch ( Exception O) {

            System.out.println("Something went wrong , please try again !");
  

        }
        finally {

            System.out.println("Thanks for your time and patience !");
        
        }

        sc.close();

    }
    
}
