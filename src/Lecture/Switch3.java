package Lecture;

import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        //mon to fri - weekdays
        //sat, sun - weekend
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weeknd");
        }
    }
}
