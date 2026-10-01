import java.io.*;
import java.util.*;

public class ReadFile {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("jackandjill.txt");
            BufferedReader reader = new BufferedReader(file);

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } 
        catch (IOException e) {
            System.out.println("Sorry, Something went wrong !");
        }
    }
}
