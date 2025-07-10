package Lecture;

import java.util.Scanner;

public class Input5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter some words:");
        String name = input.nextLine();
        System.out.println(name);

        System.out.print("Enter your marks:");
        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
