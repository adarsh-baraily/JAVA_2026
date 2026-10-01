import java.io.*;
import java.util.*;

public class firstwriting {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write("This is such an amazing book !");
        } catch (IOException e) {
            System.out.println("Something went wrong !");
        } finally {
            System.out.println("Thank You !");
        }
    }
}
