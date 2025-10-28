package Lecture.ConversionsFromOneBaseToAnother;

import java.util.Scanner;
//decimal to any base
public class ConversionFromDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Decimal Value: ");
        int n = in.nextInt();

        System.out.print("Enter base: ");
        int b = in.nextInt();

        int ans = getValueInBase(n,b);
        System.out.println(ans);
    }

    public static int getValueInBase(int n, int b) {
        int rv = 0; //return value

        int p = 1; //p for power, 1 = 10 ki power 0
        while (n != 0) {
            int dig = n % b;
            n = n / b;

            rv += dig * p;
            p *= 10;
        }
        return rv;
    }
}
