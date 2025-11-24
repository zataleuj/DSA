package com.dsa.DSA.Arrays;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {12, 2,10, 3, 4, 1,45, 0, -1};
        int min = arr[0];
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("Minimum element in the array: " + min);
        System.out.println("Maximum element in the array: " + max);
    }
}
