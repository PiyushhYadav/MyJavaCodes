package Assignment;

import java.util.Scanner;

public class VolumePyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Area = 1/3 x base area x height

        System.out.print("Enter base area: ");
        double base_area = in.nextDouble();

        System.out.print("Enter Height: ");
        double height = in.nextDouble();

        double vol = (base_area * height) / 3;

        System.out.println(vol + " cubic units");
    }
}
