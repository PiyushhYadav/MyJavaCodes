package Lecture.FibonacciSeries;

import java.util.Scanner;

public class Print_Fibonacci_Till_Given_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = in.nextInt();

        int a = 0;
        int b = 1;

        while (a <= num) {
            System.out.println(a);
             int c = a + b;
             a = b;
             b = c;
        }
    }
}
