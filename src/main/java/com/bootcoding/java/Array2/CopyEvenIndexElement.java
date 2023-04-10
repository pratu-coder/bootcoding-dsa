package com.bootcoding.java.Array2;

public class CopyEvenIndexElement {
    public static void main(String[] args){
        int[] input={10,20,30,40,50};
        int numbers=0;
        for(int i=0;i<input.length;i++){
            if(i%2==0){
              numbers++;
            }
        }
        int[] output=new int [numbers];
        int index=0;
        for(int i=0;i<input.length;i++){
            if(i%2==0){
                output[index++]=input[i];
            }
        }
        for(int i=0;i<numbers;i++){
            System.out.print(output[i]+" ,");
        }

    }
}
