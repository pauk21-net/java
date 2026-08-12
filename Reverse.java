//This program reverses a given number using a for loop. It prompts the user to enter a number, calculates its reverse, and displays the result.
import java.util.Scanner;
class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int rev = 0;

        for (int i = n; i > 0; i = i / 10) {
            int digit = i % 10;
            rev = rev * 10 + digit;
        }

        System.out.println("Reverse = " + rev);
        sc.close();
    }
}
