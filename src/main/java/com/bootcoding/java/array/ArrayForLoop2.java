package com.bootcoding.java.array;

public class ArrayForLoop2 {
    public static void main(String[] args) {
        int[] ages = {10, 20, 30, 40, 50};
        int n = ages.length;
        for (int i = n - 1; i >= 0; i--) {
            System.out.println("Array Element" + ages[i]);
        }
    }
}