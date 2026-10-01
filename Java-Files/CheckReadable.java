import java.io.*;
import java.util.*;

public class CheckReadable {
    public static void main(String[] args) {

        File file = new File("test.txt");

        if (file.exists()) {
            if (file.canRead()) {
                System.out.println("The file is readable.");
            } else {
                System.out.println("The file is not readable.");
            }
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
