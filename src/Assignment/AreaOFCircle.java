package Assignment;

import java.util.Scanner;
//Q: WAP to find Area of Circle
public class AreaOFCircle {
    public static void main(String[] args) {
        System.out.print("Enter Radius of Cicle: ");
        Scanner in = new Scanner(System.in);
        double rad = in.nextDouble();

        double area = 3.14 * rad * rad;

        System.out.println(area + " sq unit");
    }
}
