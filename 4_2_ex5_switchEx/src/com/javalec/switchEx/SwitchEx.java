package com.javalec.switchEx;

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int result = i % 2;

        switch (result){
            case 0:
                System.out.println("inesrt num is Even");
                break;
            case 1:
                System.out.println("insert num is Odd");
                break;
            default:
                System.out.println("What i = " + i + "?");
                break;
        }
    }
}
