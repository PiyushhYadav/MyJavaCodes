package Lecture.Functions;

import java.util.Scanner;
//finding nPr
public class Permutation {

//    public static int f(int x) {
//        int xsquare = x * x; // f(x) = x^2
//        return xsquare;
//    }

    public static void display(int n, int r, int npr) {
        System.out.println(n + "P" + r + " = " + npr);
    }

    public static int fact(int x) {
        int rv = 1; //return value

        for (int i = 1; i <= x; i++) {
            rv = rv * i;
        }

        return  rv;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        System.out.print("Enter the value of r: ");
        int r = in.nextInt();

        int nfact = fact(n);

        int nmrfact = fact(n - r);

        int npr = nfact / nmrfact;

        display(n,r,npr);
    }
}