package com.vishwa;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int a=0;
        int b=1;
        System.out.println("ENTER THE RANGE:");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(sum);
            a=b;
            b= sum;
            sum= a+b;

        }
    }
}
