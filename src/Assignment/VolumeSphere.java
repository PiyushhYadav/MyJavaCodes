package Assignment;

import java.util.Scanner;

public class VolumeSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Radius: ");
        double rad = in.nextDouble();

        double vol = (4 * Math.PI * rad * rad * rad) / 3;

        System.out.println(vol + " cubic units");
    }
}
