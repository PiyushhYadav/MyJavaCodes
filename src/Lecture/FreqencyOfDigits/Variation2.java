package Lecture.FreqencyOfDigits;

import Lecture.Digits_Of_Number.SumOfDigits;

import java.util.Scanner;
//Find the Sum of Digits and Product of Digits
public class Variation2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        int sum = SumOfDigits(n);
        int product = ProductOfDigits(n);

        System.out.println(sum);
        System.out.println(product);
    }

    public static int SumOfDigits(int n) {
        int sum = 0;

        while (n != 0) {

        int dig = n % 10;
        n = n / 10;

        sum = sum + dig;

        }
        return sum;
    }

    public static int ProductOfDigits(int n){
        int product = 1;

        while (n != 0) {
            int dig = n % 10;
            n = n / 10;

            product *= dig;

        }
            return product;

    }
}
