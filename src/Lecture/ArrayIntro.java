package Lecture;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] arr = new int[5]; //declaration and assignment
        arr[0] = 33;
        arr[1] = 13;
        arr[2] = 73;
        arr[3] = 87;
        arr[4] = 92;

//        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
