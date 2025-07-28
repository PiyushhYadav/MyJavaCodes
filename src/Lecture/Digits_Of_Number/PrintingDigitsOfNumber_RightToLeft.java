package Lecture.Digits_Of_Number;

import java.util.Scanner;

public class PrintingDigitsOfNumber_RightToLeft {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        while (n != 0) {
            int digit = n % 10; //extract the last digit

            System.out.println(digit);

            n = n / 10;
        }

    }
}
