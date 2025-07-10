package Assignment;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first Diagonal: ");
        double D1 = in.nextDouble();

        System.out.print("Enter second diagonal: ");
        double D2 = in.nextDouble();

        double area = (D1 * D2)/2;

        System.out.println(area + " sq units");
    }
}
