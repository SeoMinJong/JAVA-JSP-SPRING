package com.javalec.CalcTest;

public class MainClass {
    public static void main(String[] args) {
        int i;
//        for (i = 1; i <= 10; i++) {
//            System.out.println("i = " + i);
//        }
//
//        System.out.println("============================================");
//        int even_num = 0;
//        int odd_num = 0;
//
//        for (i = 1; i <= 10; i++) {
//            if (i % 2 == 0) {
//                System.out.println("even - i = " + i);
//                even_num += i;
//            }
//        }
//        System.out.println("result_num = " + even_num);
//
//        for (i = 1; i <= 10; i++) {
//            if (i % 2 == 1) {
//                System.out.println("odd - i = " + i);
//                odd_num += i;
//            }
//        }

        System.out.println("============================================");
        int k;
        int h;
        for (k = 1; k<=9; k++){
//            System.out.println("h multiplication = " + k);
            for (h=1; h<=9; h++){
                System.out.println(k + "*" + h + " = " + (h*k) + "\t");
            }
            System.out.println("");
        }
    }
}
