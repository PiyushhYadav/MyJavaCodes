package Lecture.Count_Digits;

import java.util.Scanner;

public class Counting_Digits_Negative_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the negative number: ");
        int num = in.nextInt();

        num = Math.abs(num);

        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num = num / 10;

                count++;
            }
        }
        System.out.println("Total count: " + count);
    }
}
