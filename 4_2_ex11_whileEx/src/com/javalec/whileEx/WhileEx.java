package com.javalec.whileEx;

public class WhileEx {
    public static void main(String[] args) {
        int i = 0;
        int result = 0;

        while (i <= 100){
            i += 1;
            if (i % 3 == 0){
                result += i;
            }
        }

        System.out.println("result = " + result);
    }
}
