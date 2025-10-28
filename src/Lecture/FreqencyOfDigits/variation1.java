package Lecture.FreqencyOfDigits;

import java.util.Scanner;

//Variation 1-Count Even and Odd Digits Separately
public class variation1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

         getDigitFrequency(n); //did i just called the function here by simply writing its name?


    }

    public static void getDigitFrequency(int n) { //why cant i write int instead of void here?
        int oddcount = 0;
        int evencount = 0;

        while (n != 0) {
            int dig = n % 10;
            n = n / 10;

            if (dig % 2 == 0) {
                evencount++;
            }
            else {
                oddcount++;
            }
        }

        System.out.println("Even digits: " + evencount);
        System.out.println("Odd digits: " + oddcount);
    }
}
