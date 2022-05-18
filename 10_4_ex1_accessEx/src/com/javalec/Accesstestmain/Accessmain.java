package com.javalec.Accesstestmain;

import com.javalec.accesstest.AccessTest;

public class Accessmain {
    public static void main(String[] args) {
        AccessTest at = new AccessTest();
        System.out.println("at.b = " + at.b);
//        System.out.println("at.a = " + at.a); - private 변수
    }
}
