package main.java.com.bootcoding.java.basic;

public class ArrayForLoop8 {
    public static void main(String[] args) {
        int[] arr = {50, 10, 30, 40};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];


            }

        }
        System.out.println("max ele of array is " + max);
    }
}

