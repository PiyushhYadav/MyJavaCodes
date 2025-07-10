package Assignment;

import java.util.Scanner;

public class AreaOfIsosceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //get input from user
        System.out.print("Enter the equal sides length: ");
        double side = in.nextDouble();

        System.out.print("Enter the base length: ");
        double base = in.nextDouble();

        //calculate height = sqroot(side square - b/2 square)
        double height = Math.sqrt((side * side) - (base/2 * base/2));

        //calculate area
        double area = (base * height)/2;

        System.out.println(area + " sq unit");
    }
}
