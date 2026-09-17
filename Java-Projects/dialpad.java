import java.util.*;
public class dialpad {
    public static void main(String [] args) {

        char[][] dial = {
        {'1','2','3'},
        {'4','5','6'},
        {'7','8','9'},
        {'*','0','#'}};

        for(char[] numbers : dial) {
            for(char num : numbers) {
                System.out.print(num + " ");
            }

            System.out.println();

        }
    }
}
