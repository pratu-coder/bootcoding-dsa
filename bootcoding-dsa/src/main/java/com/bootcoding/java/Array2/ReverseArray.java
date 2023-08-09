package main.java.com.bootcoding.java.Array2;

public class ReverseArray {
    public static void main(String[] args){
        //Reverse Array without using second array
        int[] input={10,20,30,40,50};
        int[] output=new int[input.length];
        int n=input.length;
        for(int i=n-1;i>=0;i--){
            output[i]=input[i];
            System.out.print(output[i]+",");
        }

    }
}
