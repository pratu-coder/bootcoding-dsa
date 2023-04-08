package com.bootcoding.java.Array2;

public class CopyEvenElement {
    public static void main(String[] args){
        //Q.Copy only even elements of a given array
        //input = {1,34,2,4,54,61}
        int[] input= {1,34,2,4,54,61};
        int EvenNumbers = 0;
        //1. check how many even number exists in input array
        for(int i=0;i<input.length;i++){
            if(input[i]%2 ==0){
                EvenNumbers++;
            }
        }
        //2. create new array according even count
        int[] output = new int [EvenNumbers];

        //3.copy old array contents to new array
        int index=0;
        for(int i=0;i<input.length;i++){
            if(input[i]%2==0){
                output[index++]=input[i];
            }
        }
        // 4. Verify new array has even numbers
        System.out.println("old Array");
        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+",");
        }
        System.out.println("\nNew Array");
        for( int i=0;i<EvenNumbers;i++){
            System.out.print(output[i]+",");
        }
    }
}




