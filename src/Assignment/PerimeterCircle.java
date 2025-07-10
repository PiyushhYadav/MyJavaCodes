package Assignment;

import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double rad = in.nextDouble();

        double peri = 2 * Math.PI * rad;

        System.out.println(peri + " unit");
    }
}
