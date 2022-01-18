package com.vishwa;

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {

        int result =sum();
        System.out.println("SUM IS:"+result);
    }
    static int  sum(){
        Scanner in = new Scanner(System.in);
        int a,b,total;
        a =in.nextInt();
        b= in.nextInt();
        total=a+b;
        return total;
    }
}