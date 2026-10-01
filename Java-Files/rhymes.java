import java.io.*;
import java.util.*;
public class rhymes {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("jackandjill.txt")) {
            writer.write("""
                    • Jack and Jill went up the hill,
                    • To fetch a pail of water.
                    • Jack fell down and broke his crown,
                    • And Jill came tumbling after.
                    • Up Jack got, and home did trot,
                    • As fast as he could caper,
                    • To old Dame Dob, who patched his nob
                    • With vinegar and brown paper.
                    """);
        }
        catch (IOException e) {
            System.out.println("Sorry, Something went wrong !");
        }
        finally {
            System.out.println("Thank You !");
        }
    }
    
}
