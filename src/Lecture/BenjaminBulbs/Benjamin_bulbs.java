package Lecture.BenjaminBulbs;

import java.util.Scanner;

public class Benjamin_bulbs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //solution- only perfect squares will be toggled because they have odd number of factors.
        //so- Print the perfect squares for the answer
        System.out.print("Enter the input: ");
        int n = in.nextInt();

        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }
    }
}
