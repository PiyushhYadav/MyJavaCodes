package Lecture.GCD_LCM;

import java.util.Scanner;

public class GCD_SubtractionMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Concept: Keep subtracting the smaller number from the larger one until both are equal.
        // That value is the GCD.

        System.out.print("Enter the numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        //edge case
        if (n1 == 0 || n2 ==0) {
            System.out.println("GCD is: " + Math.max(n1,n2));
            return;
        }

        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is: " + n1);
    }
}
