package Assignment;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        System.out.print("Enter length and breadth: ");
        Scanner in = new Scanner(System.in);
        double length = in.nextDouble();
        double breadth = in.nextDouble();

        double area = length * breadth;

        System.out.println(area);
    }
}
