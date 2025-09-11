package Lecture.Patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        int sp = 0;
        int st = n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");

            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");

            }

            if (i <= n / 2) {
                sp++;
                st -= 2;
            }
            else {
                sp--;
                st += 2;
            }
            System.out.println();
        }

    }
}
