package Lecture.GCD_LCM;

import java.util.Scanner;

public class GCD_and_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Using Division Method for HCF

        System.out.print("Enter the two numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int on1 = n1; //original n1
        int on2 = n2; //original n2

        // Edge case handling (LCM undefined if either number is 0)

        if (n1 == 0 || n2 == 0) {
            System.out.println("GCD is: " + Math.max(n1,n2));
            System.out.println("LCM is: 0");
            return;
        }
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        int gcd = n2;
        //for LCM, using property-
        //LCM x HCF = n1 x n2.
        int lcm = (on1 * on2) / gcd;

        System.out.println("GCD is: " + gcd);
        System.out.println("LCM is: " + lcm);
    }
}
