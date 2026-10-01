import java.io.File;

public class CheckWriteable {
    public static void main(String[] args) {

        File file = new File("test.txt");

        if (file.exists()) {
            if (file.canWrite()) {
                System.out.println("The file is writeable.");
            } else {
                System.out.println("The file is not writeable.");
            }
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
