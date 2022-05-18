package com.javalec.manager;

import java.util.ArrayList;

public class Student_manager {
    ArrayList<Student> students = new ArrayList<Student>();
    StudentExpel studentExpel = new StudentExpel();

    public static void main(String[] args){
        Student_manager manager = new Student_manager();

        manager.add_student("hong",20,20201343,"math");
        manager.add_student("Jin",23,20215941, "gun");
        manager.add_student("bang",25,20185984,"health");
//        System.out.println(student_manager.students.get(0).getName());
        int expel_num = 0;
        String temp_name = manager.students.get(expel_num).getName();
        int temp_age = manager.students.get(expel_num).getAge();
        int temp_student_num = manager.students.get(expel_num).getStudent_num();
        String temp_major = manager.students.get(expel_num).getMajor();

        StudentExpel.addExpelStudent(temp_name, temp_age, temp_student_num,temp_major);
        manager.students.remove(expel_num);

        System.out.println(expel_num+"student= " + manager.students.get(expel_num).getName());
    }

    public void add_student(String name, int age, int student_num, String major){
        students.add(new Student(name,age,student_num,major));
        System.out.println("add_student = " + name);
    }
}