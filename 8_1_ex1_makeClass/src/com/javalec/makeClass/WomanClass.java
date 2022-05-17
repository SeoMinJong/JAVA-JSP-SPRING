package com.javalec.makeClass;

public class WomanClass {
    private int age;
    private int height;
    private int weight;
    private String phone_num;

    public WomanClass() {

    }

    public WomanClass(int age, int height, int weight, String phone_num){
        this.age=age;
        this.height = height;
        this.weight = weight;
        this.phone_num = phone_num;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }
}
