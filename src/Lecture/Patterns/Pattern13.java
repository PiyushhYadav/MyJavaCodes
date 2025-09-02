package Lecture.Patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
// Using formula-
// iCj+1 = iCj (i-j) / j+1
        for (int i = 0; i <= n; i++) {
            int icj = 1; // iCj
            for (int j = 0; j <= i; j++) {
                System.out.print(icj + "\t");
                int ijp1 = icj * (i - j) / (j + 1); // iCj+1

                icj = ijp1;
            }
            System.out.println();
        }

    }
}
