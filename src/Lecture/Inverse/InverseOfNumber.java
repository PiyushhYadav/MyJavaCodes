package Lecture.Inverse;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        int inv = 0; //inverse
        int op = 1; //Original Place

        while (n != 0) {
            int od = n % 10; //original digit, extracts last digit
            int id = op; //inverted digit
            int ip = od; //inverted place

            //makes changes to inv using id and ip.

            inv = inv + id * (int) Math.pow(10, ip - 1);
            /* two things to remember here-
            1.  Remove the last digit
            2. increase the original place
             */
            n = n / 10;
            op++;
        }
        System.out.println(inv);
    }
}
