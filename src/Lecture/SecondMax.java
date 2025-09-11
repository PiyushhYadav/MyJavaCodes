package Lecture;

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the " + n + " Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int maxi = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        System.out.println("Maximum Element is :" + maxi);

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > Smax) && arr[i] != maxi) {
                Smax = arr[i];
            }
        }
        System.out.println("Second maximum element is :" + Smax);
    }
}
