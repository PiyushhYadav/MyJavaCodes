package Lecture.PrimeNumbers;

import java.util.Scanner;

public class PrimeNumbersTillN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter low value: ");
        int low = in.nextInt();

        System.out.print("Enter high value: ");
        int high = in.nextInt();

        for (int n = low; n <= high; n++) {
            int count = 0;
            //try to divide n and increase count
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(n);
            }
        }
    }
}
