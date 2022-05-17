package com.javalec.hAve;

import java.util.Scanner;

public class HeightAve {
    public static void main(String[] args) {
        String[] iArrName = {"Yung","Chull","Gill","Young","Mal"};
        int[] iArr = new int[5];
        int totalHeight = 0;
        int maxH = 0;
        int maxHIndex = 0;
        int minH = 0;
        int minHIndex = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            System.out.println(iArrName[i]+"'s height?");
            iArr[i] = scanner.nextInt();
            totalHeight += iArr[i];
        }

        System.out.println("Ave height : "+ (totalHeight/iArr.length));
    }
}
