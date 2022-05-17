package com.javalec.makeClass;

public class MainClass {
    public static void main(String[] args) {
        ManClass man1 = new ManClass(25,170,87,"010-3927-9938");
        WomanClass woman1 = new WomanClass(28,54,60,"010-8456-1431");
        WomanClass woman2 = new WomanClass();
        woman2.setAge(28);
        woman2.setHeight(54);
        woman2.setWeight(60);
        woman2.setPhone_num("010-8456-1431");

        int woman1_age = woman1.getAge();
        int woman2_age = woman2.getAge();
        System.out.println(woman1.equals(woman2));
        System.out.println(woman1_age==woman2_age);

        double man1_BMI = man1.caculateBMI();
        System.out.println("man1_BMI = " + man1_BMI);
    }
}
