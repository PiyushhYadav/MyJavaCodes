package Assignment;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.print("Enter Base and Height: ");
        Scanner in = new Scanner(System.in);
        double base = in.nextDouble();
        double height = in.nextDouble();

        double area = 0.5 * base * height;

        System.out.println(area + " sq unit");
    }
}
