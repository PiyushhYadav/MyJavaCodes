package Lecture;

import java.util.Scanner;

public class MaxElement2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of Elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        //Initialise Maxi as the smallest Possible integer

        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }

        System.out.println("Maximum Element is: " + maxi);
    }
}
