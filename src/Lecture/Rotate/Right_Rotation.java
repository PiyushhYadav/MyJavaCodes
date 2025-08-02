package Lecture.Rotate;

import java.util.Scanner;

public class Right_Rotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        System.out.print("Enter the number of rotation: ");
        int k = in.nextInt();

        //calculate number of digits
        int temp = n;
        int nod = 0;

        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }

        int div = 1;
        int mult = 1;

        //for large and negative rotations
        k = k % nod;
        if (k < 0) {
            k = k + nod;
        }

        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                mult = mult * 10;
            } else {
                div = div * 10;
            }
        }

        int q = n / div;
        int r = n % div;

        int rot = r * mult + q;

        System.out.println(rot);
    }
}
