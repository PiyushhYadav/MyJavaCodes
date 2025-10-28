package Lecture.ConversionsFromOneBaseToAnother;

import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        System.out.print("Enter base of the numbers: ");
        int b = in.nextInt();

        int sum = getSum(n1, n2, b);

        System.out.println(sum);
    }

    public static int getSum(int n1, int n2, int b) {
        int rv = 0; //return value

        int p = 1; //power

        int c = 0; //carry
        while (n1 != 0 || n2 != 0 || c != 0) {
            int d1 = n1 % 10; //1st digit
            int d2 = n2 % 10; //2nd digit
            n1 = n1 / 10;
            n2 = n2 / 10;

            int d = d1 + d2 + c; //carry must include
            c = d / b;
            d = d % b;

            rv += d * p;
            p *= 10;
        }

        return rv;
    }
}
