package Lecture.Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //DIAGONAL OF n STAR
        System.out.print("Enter the Value of n: ");
        int n = in.nextInt();

        int sp = 0;
        int st = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");

            }
            for (int k = 1; k <= st; k++) {
                System.out.print("*\t");

            }

            sp++;

            System.out.println();
        }
    }
}
