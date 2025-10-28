package Lecture;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the value of " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = in.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.println("Element not found in array.");
        }

    }

}
