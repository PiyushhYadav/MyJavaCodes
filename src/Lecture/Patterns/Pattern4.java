package Lecture.Patterns;

import java.util.Scanner;
// Right Inverted Right Angled Triangle
public class Pattern4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Value of n: ");
        int n = in.nextInt();

        int st = n;
        int sp = 0;

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= sp; k++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            st--;
            sp++;
            System.out.println();
        }
    }
}
