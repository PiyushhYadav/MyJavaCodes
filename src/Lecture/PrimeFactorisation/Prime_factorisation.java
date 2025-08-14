package Lecture.PrimeFactorisation;

import java.util.Scanner;

public class Prime_factorisation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        for (int div = 2; div * div <= n; div++) {
            while (n % div == 0) {
                n = n / div;
                System.out.print(div + " ");
            }
        }
//        if (n != 1) {
//            System.out.print(n);
//        }
    }
}
/*optimisation-
1. if pq = n, then p and q can't be greater than root n simultaneously.
so, we will only check div till root n.
 */
