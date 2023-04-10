package com.bootcoding.java.Array2;

public class CopyOddElement {
    public static void main(String[] args){
        int[] input={11,34,23,44,45,61};
        int oddNumbers=0;
        for(int i=0;i<input.length;i++){
            if(input[i]%2!=0){
                oddNumbers++;
            }
        }
        int[] output=new int[oddNumbers];
        int index=0;
        for(int i=0;i<input.length;i++){
            if(input[i]%2!=0){
                output[index++]=input[i];
            }
        }
        for(int i=0;i<oddNumbers;i++){
            System.out.print(output[i]+",");
        }
    }


}
