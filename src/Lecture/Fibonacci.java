package Lecture;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Que- Find the nth number of fibonacci series - 0,1,1,2,3,5,8,13,21,33...

        int n = in.nextInt();
        int a = 0; //previous
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
