package com.vishwa;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int result=0;
//        while (n>0){
//            int r= n%10;
//            System.out.print(r);
//            n=n/10;
//        }

        while(n>0){
            int r=n%10;
            result=(result*10)+r;
            n=n/10;
        }
        System.out.println(result);
    }
}
