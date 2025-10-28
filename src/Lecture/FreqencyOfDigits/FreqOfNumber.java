package Lecture.FreqencyOfDigits;

import java.util.Scanner;

public class FreqOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        int count = 0;

        while (num != 0) {
            int digit = num % 10;

            if (digit == 9) {
                count++;
            }

            num = num / 10;
        }
        System.out.println(count);
    }
}
