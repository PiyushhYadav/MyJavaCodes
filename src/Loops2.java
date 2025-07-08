import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        //Que- print numbers from 1 to n

        System.out.print("Enter Value of n: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int num = 1; num <= n; num++) {
//            System.out.print(num + " ");
            System.out.println("Hello World");
        }
    }
}
