package Lecture.Patterns;

import java.util.Scanner;
//Que- Printing Table
public class Pattern14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Value of x: ");
        int x = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            int val = x * i;
            System.out.println(x + " * " + i + " = " + val);
        }

    }
}
