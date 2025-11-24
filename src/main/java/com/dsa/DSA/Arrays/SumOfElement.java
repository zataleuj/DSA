package com.dsa.DSA.Arrays;

public class SumOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum=0;
        for(int a: arr){
            sum=sum+a;
        }
        System.out.println("Sum of array elements: " + sum);
    }

}
