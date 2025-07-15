package Lecture;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of Inputs: ");
        int t = in.nextInt();

        System.out.print("Enter numbers:");

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();

            int count = 0;
            for (int div = 2; div * div <= n; div++) { //div <= sqrt n
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
/*2 optimization are being done here-
1. loop ko nai 1 se n nai chlaya, 2 se root n chlaya
2.agar 1 division ho chuka h, to apko bar bar check krne ki zarurat nai h, hence break the loop.
 */