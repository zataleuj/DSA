package com.dsa.DSA.Arrays;

public class SumOfDigit {
    public static void main(String[] args) {
        int number=1234;
        int sum=0;
        String str=String.valueOf(number);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            sum=sum+ch-48;
        }
        System.out.println("sum of "+number+" is :"+sum);
    }

}
