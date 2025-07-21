package Lecture.PrimeNumbers;

import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Check if a single number is prime
        System.out.print("Enter Number: ");
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
            System.out.println("not Prime");
        }

    }
}
