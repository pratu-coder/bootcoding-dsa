package com.bootcoding.java.basic;



public class ArrayForLoop7 {
    public static void main(String[] args) {

        int[] odd= {7, 22, 19, 44, 45, 65, 66};
        int sum= 0;
        for (int i = 0; i < odd.length; i++) {
            if (odd[i] % 2 != 0) {
                sum = sum + i;
            }

            System.out.println("sum of all element " + odd[i]);
        }
    }
}