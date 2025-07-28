package Lecture.Digits_Of_Number;

import java.util.Scanner;

public class Print_DigitsOf_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        int nod = 0;
        int temp = n; //no of digits
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }

        int div = (int) Math.pow(10, nod - 1);
        while (div != 0) {
            int q = n / div; // quotient
            System.out.println(q);

            n = n % div; //remove that digit
            div = div / 10; //reduce divisor by factor 10
        }

    }
}
