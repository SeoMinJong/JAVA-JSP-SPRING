package com.javalec.calEx;

import java.util.Scanner;

public class CalEx {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        System.out.println("i를 3으로 나눈 나머지 값");
        System.out.println("i % 3 = "+(i % 3));
    }
}
