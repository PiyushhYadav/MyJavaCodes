package Lecture;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.print("Enter the number to Lecture.Reverse: ");
        //Q: Program to Lecture.Reverse the number
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }

        System.out.println(ans);
    }
}
