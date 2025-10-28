package Lecture;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the value of " + n + " Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        boolean issorted = true; //assuming it is sorted

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i+1]) {
                issorted = false;
                break;
            }
        }

        if (issorted) {
            System.out.println("Array is sorted in ascending order.");
        }
        else {
            System.out.println("Array is NOT sorted.");
        }
    }
}
