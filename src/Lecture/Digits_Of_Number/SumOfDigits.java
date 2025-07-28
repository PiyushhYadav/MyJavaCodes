package Lecture.Digits_Of_Number;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        int sum = 0; //declare and initialise sum

        while (n != 0) {
            int digit = n % 10; //extracts last digit

            sum += digit; // add digit to the sum

            n = n / 10; //removes last digit from n

        }
        System.out.println("Sum of digis are: " + sum);
    }
}
