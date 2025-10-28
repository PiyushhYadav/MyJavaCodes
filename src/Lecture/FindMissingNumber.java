package Lecture;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

//Find the missing number from 0 to n in an array of size in [0 - N]
public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " Elements (0 to " + n + " with one missing): ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr); //array must be sort
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                num++;
            }
            else {
                System.out.println("Missing Number is: "+ num);
                break;
            }
        }
    }
}
