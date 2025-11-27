package com.dsa.DSA.Arrays;

public class Rotate90Degree {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 4, 3}, {5, 2, 8}};

        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println(" ");
        }

    }
}
