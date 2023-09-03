package main.java.com.bootcoding.java.Array2;
public class NumberGreaterThanAverage{
    public static void main(String[]args){
        //Write a program to find the number of elements in an array that are greater than the average.
        int[] num={2,4,6,7,9};
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        double avg=sum/num.length;
        for(int i=0;i<num.length;i++){
            if (num[i]>avg) {
                System.out.print(num[i]+",");
            }
        }
    }
}