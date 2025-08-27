package Lecture.Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        int sp = n - 1; //space
        int st = 1; //star

        for (int i = 1; i <= n; i++) {
//            System.out.print(sp + "," + st);
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            for (int k = 1; k <= st; k++) {
                System.out.print("*\t");

            }

            sp--;
            st++;
            System.out.println();
        }

    }
}
