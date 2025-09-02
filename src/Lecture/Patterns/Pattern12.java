package Lecture.Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Value of n: ");
        int n = in.nextInt();
        //Fibonacci Series- 0 1 2 3 5 8 13...
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "\t");

                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }

    }
}
