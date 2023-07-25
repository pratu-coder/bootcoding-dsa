package main.java.com.bootcoding.java.Array2;

public class CopyElement {
    public static void main(String args[]) {
        //Copy elements of an array into another array in a reverse order
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = new int[arr1.length];
        int n = arr1.length;
        for (int i = n - 1; i >= 0; i--) {
            arr2[i] = arr1[i];
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(arr2[i]+" ");
        }
    }
}






