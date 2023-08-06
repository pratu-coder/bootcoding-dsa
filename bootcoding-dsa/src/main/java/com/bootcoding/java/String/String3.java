package main.java.com.bootcoding.java.String;

public class String3 {
    public static void main(String[] args) {
        System.out.println("I\'m  alright");
        System.out.println("I am software engineer java \"Google\"");
        System.out.println("Today is 14\\04\\2023");

        String s1="2023-04-14";
        String [] s2=s1.split("-");
        String s3=s2[0];
        String s4=s2[1];
        String s5=s2[2];
        System.out.println( "year"+"="+ s3);
        System.out.println("month"+"="+ s4);
        System.out.println("day"+"="+ s5);
    }
}
