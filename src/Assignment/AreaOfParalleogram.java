package Assignment;

import java.util.Scanner;

public class AreaOfParalleogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Base: ");
        double base = in.nextDouble();

        System.out.print("Enter Height: ");
        double height = in.nextDouble();

        double area = base * height;

        System.out.println(area + " sq unit");
    }
}
