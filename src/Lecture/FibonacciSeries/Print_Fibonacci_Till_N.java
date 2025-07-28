package Lecture.FibonacciSeries;

import java.util.Scanner;

public class Print_Fibonacci_Till_N {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Vakue of N: ");
        int n = in.nextInt();
        //Fibonacci series- 0 1 1 2 3 5 8 13 21 34
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b; // why not b = a
            b = c; // why not c = b because here we have to assign the value of b to c
        }

    }
}
