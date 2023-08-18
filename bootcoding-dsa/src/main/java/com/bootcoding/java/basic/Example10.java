package main.java.com.bootcoding.java.basic;

public class Example10 {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        int c = 50;

        if (a > b) {
            if (a > c) {
                System.out.println(a + "is the largest number");
            } else {
                System.out.println(c + "is the largest number");
            }
        } else {
            if (b > c) {
                System.out.println(b + "is the largest number");
            }
        }
    }
}

