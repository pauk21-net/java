// This program calculates the Greatest Common Divisor (GCD) of two numbers using the Euclidean algorithm. It prompts the user for input and displays the calculated GCD.
import java.util.Scanner;
class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        System.out.println("GCD = " + a);
        sc.close();
    }
}
