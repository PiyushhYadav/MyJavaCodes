package Lecture;

import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        int nod = 0; //no of digits
        int temp = n;
         while (temp != 0) {
             temp = temp / 10;
             nod++; //yha tk to counting digits wala part same
         }

         int div = (int) Math.pow(10, nod - 1); //(int) decimal ko integer me krne k liye
        while (div != 0) {
            int q = n / div;
            System.out.println(q);

            n = n % div;
            div = div / 10;
        }
    }
}
