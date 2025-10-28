package Lecture.ConversionsFromOneBaseToAnother;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        System.out.print("Enter the base of the given number: ");
        int b1 = in.nextInt();

        System.out.print("Enter the base you want to convert: ");
        int b2 = in.nextInt();

        int ans = getValue(n,b1,b2);

        System.out.println(ans);

    }

    public static int getValue(int n, int b1, int b2) {
        int rv = 0;

        int p = 1;
        while(n != 0) {
            int dig = n % b2;
            n = n / b2;

            rv += dig * p;
            p = p * b1;
        }

        return rv;
    }
}
