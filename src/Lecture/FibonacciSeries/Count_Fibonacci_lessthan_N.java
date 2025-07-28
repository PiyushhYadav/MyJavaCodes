package Lecture.FibonacciSeries;

import java.util.Scanner;

public class Count_Fibonacci_lessthan_N {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    //Que- Count how many Fibonacci numbers are ≤ N
        System.out.print("Enter the Value of N: ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 0;

        while (a <= n) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
            count++;

        }
        System.out.println("Count: " + count);
    }
}
