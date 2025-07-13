package Lecture;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Banana" -> System.out.println("Yellow Fruit");
            case "Orange" -> System.out.println("Round Fruit");
            case "Grapes" -> System.out.println("small fruit");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}
//        switch (fruit) {
//        case "Mango" :
//        System.out.println("King of Fruits");
//                break;
//                        case "Apple" :
//                        System.out.println("A sweet red fruit");
//                break;
//                        case "Banana":
//                        System.out.println("Yellow Fruit");
//                break;
//                        case "Orange":
//                        System.out.println("Round Fruit");
//                break;
//                        case "Grapes":
//                        System.out.println("small fruit");
//                break;
//default:
//        System.out.println("Please enter a valid fruit");
