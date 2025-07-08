import java.util.Scanner;

public class Largest2 {
    public static void main(String[] args) {
        //finding largest of three number using math.max
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = Math.max(c, Math.max(a,b));

        System.out.println(max);
    }
}
