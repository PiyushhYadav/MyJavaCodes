package Lecture;

import java.util.Scanner;

public class SecondMax2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the value of " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

        }

        int maxi = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                smax = maxi;
                maxi = arr[i];
            }

            else if (arr[i] < maxi && arr[i] > smax) {
                smax = arr[i];
            }
        }
        System.out.println("Maximum Element is: " + maxi);
        System.out.println("Second maximum Element is: " + smax);
    }
}
