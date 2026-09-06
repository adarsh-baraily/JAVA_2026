import java.util.*;
public class pasta {
    public static void main(String[] args) {

        String pasta = getpizza("Hot Sauce", "cheese", "tomato", "pasta");
        System.out.println(pasta);
    }
    static String getpizza(String sauce, String cheese, String tomato, String pasta) {

        return "Your pasta is ready with " + sauce + ", " + cheese + ", " + tomato + ", and " + pasta + ". Enjoy your meal !";

    }

}
