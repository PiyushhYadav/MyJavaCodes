package Lecture;

import java.util.Scanner;

public class Grading_System {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks: ");

        int marks = in.nextInt();

        if (marks > 90) {
            System.out.println("Excellent");
        }
        else if (marks > 80 && marks <= 90) {
            System.out.println("Good");
        }
        else if (marks > 70 && marks <= 80) {
            System.out.println("Fair");
        }
        else if (marks > 60 && marks <= 70) {
            System.out.println("Meets expectations");
        }
        else {
            System.out.println("Below Average");
        }
    }
}
