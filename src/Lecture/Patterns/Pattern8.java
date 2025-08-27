package Lecture.Patterns;
// REVERSE DIAGONAL OF n STARS

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        int sp = n - 1; //space
        int st = 1; //star

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            for (int k = 1; k <= st; k++) {
                System.out.print("*\t");

            }
            sp--;

        System.out.println();
        }
    }
}
