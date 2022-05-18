package com.javalec.manager;

public class Student {
    private String name;
    private int age;
    private int student_num;
    private String major;

    public Student(String name, int age, int student_num, String major){
        this.name = name;
        this.age = age;
        this.student_num = student_num;
        this.major = major;
    }

    public void update_info(int i, String info){
        switch (i){
            case 1:
                setName(info);
            case 2:
                setAge(Integer.parseInt(info));
            case 3:
                setStudent_num(Integer.parseInt(info));
            case 4:
                setMajor(info);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudent_num() {
        return student_num;
    }

    public void setStudent_num(int student_num) {
        this.student_num = student_num;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}
