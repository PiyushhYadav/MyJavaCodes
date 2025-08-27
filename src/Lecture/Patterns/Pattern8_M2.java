package Lecture.Patterns;
//REVERSE DIAGONAL OF n STARS M-2
import java.util.Scanner;

public class Pattern8_M2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Value of n: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j == n + 1) {
                    System.out.print("*\t");

                }
                else {
                    System.out.print("\t");

                }
            }
            System.out.println();
        }

    }
}
