import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a your number :");
        int num = sc.nextInt();
        int originalNum = num;
        int reversedNum = 0;

        while(num != 0) {
            reversedNum = reversedNum * 10 + num % 10;
            num /= 10;
        }

        if(originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }

        sc.close();
    }
}
