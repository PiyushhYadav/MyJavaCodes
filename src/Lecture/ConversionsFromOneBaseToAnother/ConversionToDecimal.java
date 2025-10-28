package Lecture.ConversionsFromOneBaseToAnother;

import java.util.Scanner;

public class ConversionToDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        System.out.print("Enter the base of the given number: ");
        int b = in.nextInt();

        int ans = getValueInDecimal(n,b);

        System.out.println(ans);

    }

    public static int getValueInDecimal(int n, int b) {
        int rv = 0;

        int p = 1;
        while (n != 0) {
            int dig = n % 10;
            n = n / 10;

            rv += dig * p;
            p *= b;
        }

        return rv;
    }
}
