package Lecture.Patterns;
//RHOMBUS OUTLINE

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        int os = n / 2; //Outer Space
        int is = -1; //Inner Space

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= os; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");

            for (int k = 1; k <= is; k++) {
                System.out.print("\t");
            }

            if (i > 1 && i < n) {
                System.out.print("*\t");

            }

            if (i <= n / 2) {
                os--;
                is += 2;
            } else {
                os++;
                is -= 2;
            }
            System.out.println();
        }
    }
}
