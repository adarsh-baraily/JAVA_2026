import java.util.*;
public class twodarray {
    public static void main(String[] args) {

        String[][] items = {{"potato", "onion",},{"fish", "eggs"},{"water", "softdrink"}};
        items[0][1] = "spinach";

        for(String[] edibles : items) {
            for(String edible : edibles) {
                System.out.print(edible + " ");
            }

            System.out.println();
            
        }
    }
}