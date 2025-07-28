package Lecture.Count_Digits;

import java.util.Scanner;

public class Count_Even_Digits_Of_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                int digit = num % 10; //extract lasts digit
                if (digit % 2 == 0) { //even odd check
                    count++;
                }

                num /= 10; //removes last digit
            }
        }
        System.out.println("Total Even Digits: " + count);

    }
}
