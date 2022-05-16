package com.javalec.ave;

import java.util.Scanner;

public class AverageClass {
    public static void main(String[] args) {
        int i = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.println("insert Korean score");
        int kor = scanner.nextInt();
        System.out.println("insert English score");
        int eng = scanner.nextInt();
        System.out.println("insert Math score");
        int mat = scanner.nextInt();

        double ave = (kor + eng + mat) / 3;

        if (kor > ave){
            System.out.println("kor is high");
        }
        else if (kor < ave){
            System.out.println("kor is low");
        }
        else {
            System.out.println("kor is normal");
        }


        if (eng > ave){
            System.out.println("eng is high");
        }
        else if (eng < ave){
            System.out.println("eng is low");
        }
        else {
            System.out.println("eng is normal");
        }


        if (mat > ave){
            System.out.println("mat is high");
        }
        else if (mat < ave){
            System.out.println("mat is low");
        }
        else {
            System.out.println("mat is normal");
        }
    }
}
