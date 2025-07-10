package Lecture;

public class TypeCasting3 {
    public static void main(String[] args) {
        //Automatic Type Promotion in Expressions
        int a = 257;
        byte b = (byte) (a);
        //the byte can store 256 different values, now if we put the 257, it will print the difference between them
        //257 % 256 = 1
        System.out.println(b);
    }
}
