package Lecture.Pythagorean_Triplets;
//Pythgorean triplet- Wo numbers jinse right angle traingle bnaya ja skta hai.

import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Value of a, b, c: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;

        if (b >= max) {
            max = b;
        }

        if (c >= max) {
            max = c;
        }

        if (max == a) {
            boolean flag = ((b * b) + (c * c) == (a * a));
            System.out.println(flag);
        } else if (max == b) {
            boolean flag = ((a * a) + (c * c) == (b * b));
            System.out.println(flag);
        } else if (max == c) {
            boolean flag = ((b * b) + (a * a) == (c * c));
            System.out.println(flag);
        }
    }
}
