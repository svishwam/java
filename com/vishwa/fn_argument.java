package com.vishwa;

public class fn_argument {
    public static void main(String[] args) {
        String res = name("vishwa");
        System.out.println(res);

    }
    static String name(String name){
        String msg="Welcome"+name;
        return msg;
    }
}
