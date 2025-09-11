package Lecture;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of Elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        //Initialise mini as the largest Integer

        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        System.out.println("Minimum Value is: " + mini);
    }
}
