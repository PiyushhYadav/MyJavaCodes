package Assignment;

import java.util.Scanner;

public class AreaOfEquiTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter side: ");
        double side = in.nextDouble();

        double area = (Math.sqrt(3) * side * side ) / 4;

        System.out.println(area + " sq unit");
    }
}
