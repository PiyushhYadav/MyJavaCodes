package Lecture;

import java.util.Scanner;
//Print digits of a number
public class Args {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        while (num != 0) {
            int rem = num % 10;
        System.out.println(rem);

        num = num / 10;
        }

    }
}