import java.util.*;
public class foodchoice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter the no. of food items to be entered : ");
        n = sc.nextInt();
        sc.nextLine();

        for(int i = 1 ; i <= n; i++) {


            System.out.print("Enter item number " + i + " :");
            String food = sc.nextLine();
            foods.add(food);
            


        }


        System.out.println(foods);

        sc.close();

        
    }
    
}
