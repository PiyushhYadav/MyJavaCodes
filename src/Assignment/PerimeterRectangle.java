package Assignment;

import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double len = in.nextDouble();

        System.out.print("Enter breadth/width: ");
        double wid = in.nextDouble();

        double peri = 2 * (len + wid);

        System.out.println(peri + " units");
    }
}
