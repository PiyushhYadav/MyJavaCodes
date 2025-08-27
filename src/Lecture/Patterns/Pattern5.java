package Lecture.Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //DIAMOND
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        int sp = n/2;
        int st = 1;

        for (int i = 1; i <= n; i++) {
//            System.out.print(st + sp);
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            for (int k = 1; k <= st; k++) {
                System.out.print("*\t");

            }
            if (i <= n/2) {
                sp--;
                st += 2;
            }
            else {
                sp++;
                st -= 2;
            }

        System.out.println();
        }
    }
}
