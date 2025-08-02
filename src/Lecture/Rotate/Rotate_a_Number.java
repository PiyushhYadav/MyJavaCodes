package Lecture.Rotate;

import java.util.Scanner;

public class Rotate_a_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        System.out.print("Enter the number of rotation: ");
        int k = in.nextInt();

        //counting no. of digits
        int temp = n;
        int nod = 0; //no of digits

        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }

        //for larger and negative rotations-
        k = k % nod; //if we say k = 352 and nod = 5, then the k will become 2.
        if (k < 0) {
            k = k + nod;
        }

        int div = 1; //divisor why 1??
        int mult = 1; //multiplier why 1??

        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                mult = mult * 10;
            }
        }
        int q = n / div;
        int r = n % div;

        int rot = r * mult + q; //rotated number
        System.out.println(rot);
    }
}
