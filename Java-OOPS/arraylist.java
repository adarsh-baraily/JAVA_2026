import java.util.*;
public class arraylist {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Guava");
        fruits.add("Watermelon");
        fruits.add("Grapes");

        Collections.sort(fruits);

        //fruits.get();
        //fruits.set( , );

        System.out.println(fruits.size());
        System.out.println(fruits);
        

    }
    
}
