package com.dsa.DSA.Arrays;

public class SumOfTwoDiamentionalArray {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,4,3},{5,2,8}};

        for(int i=0;i< arr.length;i++){
            int sum=0;
            for(int j=0;j< arr[i].length;j++){
                sum=sum+arr[j][i];
            }
            System.out.println(sum);
        }

    }
}
