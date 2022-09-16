package practice_10;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        System.out.println("exercise 1: ");
        ex1();

    }
    static void ex1() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = console.nextInt();
        console.close();
        int s = 1;
        for (int i = 1; s <= n; i++) {
                for (int j = 0; j < i; j++) {
                        System.out.print(i + " ");
                        s++;
                        if (s >= n) break;
                }
            }
        }
}
