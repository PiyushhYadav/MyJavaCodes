package Lecture;

import java.util.Scanner;

public class Inputss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the integer: ");
        int n = Integer.parseInt(in.nextLine());

        System.out.print("Enter the string: ");
        String name = in.nextLine();

        System.out.println("Dear" + name + "Here is your counting.");
        for (int i = 1; i <=n; i++) {
            System.out.println(i);
        }
    }
}
