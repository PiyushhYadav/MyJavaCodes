package Lecture.Digits_Of_Number;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        int original = n;
        int rev = 0;

        while (n != 0) {
            int digit = n % 10; //extracts last digit

            rev = (rev * 10) + digit;

            n = n / 10;
        }
        if (rev == original) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not a Palindrome.");
        }
    }
}
