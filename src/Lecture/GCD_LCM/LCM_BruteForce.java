package Lecture.GCD_LCM;

import java.awt.image.RasterOp;
import java.util.Scanner;

public class LCM_BruteForce {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Concept: Start from max(a, b) and keep checking until a number divisible by both is found.

        System.out.print("Enter the number: ");
        int a = in.nextInt();
        int b = in.nextInt();

        int max = Math.max(a,b);

        //edge case
        if (a == 0 || b == 0) {
            System.out.println("LCM is: 0");
            return;
        }

        int lcm = max;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm++;
        }
        System.out.println("LCM is: " + lcm);
    }
}
