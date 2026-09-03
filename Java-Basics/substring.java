import java.util.*;
public class substring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email id : ");
        String email = sc.nextLine();

        if(email.contains("@")) {

            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Your username is : " + username);
            System.out.println("Your email domain is : " + domain);

        } else {

            System.out.println("Invalid email id");
        }
        sc.close();
    }
    
}
