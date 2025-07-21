package Lecture.PrimeNumbers;

import java.util.Scanner;

public class IsNumberPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of Inputs: ");
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {  //what if int i =1

            System.out.print("Enter the numbers: ");
            int n = in.nextInt();

            int count = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
            }
    }
}
/* Optimisation-
1. check for root n
2. exclude also 1. Start div from 2.
 */