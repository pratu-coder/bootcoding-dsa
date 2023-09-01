package main.java.com.bootcoding.java.basic;

public class factorialNumber {
    public static void main(String[] args) {
        int fact = 0;
        for (int i = 1; i <= 5; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}