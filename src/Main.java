import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of inputs: ");
        int t = in.nextInt();

        System.out.print("Enter Numbers:");


        for (int i = 0; i < t; i++) {
            int n = in.nextInt();

            int count = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }

    }
}
