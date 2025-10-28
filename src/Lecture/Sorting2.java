package Lecture;
//Sorting shortcut
import java.util.Arrays;
import java.util.Scanner;

public class Sorting2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr); //in-bulit shortcut to sort array in ascending order.

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
