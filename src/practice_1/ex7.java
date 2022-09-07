package practice_1;

import java.util.Scanner;

public class ex7 {
    public static void main (String args[]) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = console.nextInt();
        System.out.printf("Your number: %d", x);
        console.close();
        System.out.print("\nFactorial = " + factorial(x));

    }
    static int factorial(int x) {
        int result = 1;
        for (; ;) {
            result *= x;
            x--;
            if (x == 1) break;
        }
        return result;
    }
}
