package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class PerimeterRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Side: ");
        double side = in.nextDouble();

        double peri = 4 * side;

        System.out.println(peri + " units");

    }
}
