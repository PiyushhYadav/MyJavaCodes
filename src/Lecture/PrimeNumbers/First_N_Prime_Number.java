package Lecture.PrimeNumbers;

import java.util.Scanner;

public class First_N_Prime_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Value of N: ");
        int n = in.nextInt();

        int count = 0; //how many primes printed
        int num = 2; //Start checking from 2
        while (count < n) {
            int divcount = 0; //reset for every num
            for (int div = 2; div * div <= num; div++) {
                if (num % div == 0) {
                    divcount++;
                    break;
                }
            }
            if (divcount == 0) {
                System.out.println(num);
                count++;
            }
            num++; //check next number
        }
    }
}
