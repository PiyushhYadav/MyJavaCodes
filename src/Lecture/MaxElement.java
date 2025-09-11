package Lecture;

public class MaxElement {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 33;
        arr[1] = 13;
        arr[2] = 73;
        arr[3] = 87;
        arr[4] = 92;

        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];

            }
        }
        System.out.println("Maximum Element: " + maxi);

    }
}
