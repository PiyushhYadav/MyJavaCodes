package Lecture.Pythagorean_Triplets;

import java.util.Scanner;

public class Triplets_Variation2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the inputs a, b and c: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = (int)Math.max(a, Math.max(b,c));

        if (max == a) {
            boolean flag = ((b * b) + (c * c) == (a * a));
            System.out.println(flag);
        }

        if (max == b) {
            boolean flag = ((a * a) + (c * c) == (b * b));
            System.out.println(flag);
        }

        else {
            boolean flag = ((b * b) + (a * a) == (c * c));
            System.out.println(flag);
        }
    }
}
