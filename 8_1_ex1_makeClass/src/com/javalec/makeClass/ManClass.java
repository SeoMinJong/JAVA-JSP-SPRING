package com.javalec.makeClass;

public class ManClass {
    private int age;
    private int height;
    private int weight;
    private String phone_num;


    public ManClass(){

    }
    public ManClass(int age, int height, int weight, String phone_num){
        this.age=age;
        this.height = height;
        this.weight = weight;
        this.phone_num = phone_num;
    }

    public double caculateBMI(){
        double result;
        result = (weight)/Math.pow(height,2)*10000;

        return result;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }
}