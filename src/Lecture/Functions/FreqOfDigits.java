package Lecture.Functions;

import java.util.Scanner;

public class FreqOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        System.out.print("Enter the digit whose freq is to be found: ");
        int d = in.nextInt();

        int f = getDigitFrequency(n,d);

        System.out.println(f);

    }
    public static int getDigitFrequency(int n, int d) {
        int count = 0;

        while (n != 0) {
            int dig = n % 10;
            n = n / 10;

            if (dig == d) {
                count++;
            }

        }
        return count;
    }
}
