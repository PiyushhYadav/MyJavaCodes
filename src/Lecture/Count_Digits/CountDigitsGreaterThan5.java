package Lecture.Count_Digits;

import java.util.Scanner;

public class CountDigitsGreaterThan5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                int digit = num % 10; //extract last digit
                if (digit > 5) {
                    count++;
                }

                num = num / 10;
            }
        }
        System.out.println("Total Digits greater than 5 are: " + count);
    }
}
