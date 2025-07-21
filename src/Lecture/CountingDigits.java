package Lecture;

import java.util.Scanner;

public class CountingDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = in.nextInt();

        int dig = 0;
        while (n > 0) {
            n = n / 10;
            dig++;
        }
        System.out.println(dig);
    }
}
