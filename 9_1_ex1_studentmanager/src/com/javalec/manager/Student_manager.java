package com.javalec.manager;

import java.util.ArrayList;

public class Student_manager {
    ArrayList<Student> students = new ArrayList<Student>();
    StudentExpel studentExpel = new StudentExpel();

    public static void main(String[] args){
        Student_manager student_manager = new Student_manager();

        student_manager.add_student("hong",20,1,"math");
        student_manager.add_student("Jin",23,2, "gun");
        student_manager.add_student("bang",25,3,"health");
//        System.out.println(student_manager.students.get(0).getName());
        String temp_name = student_manager.students.get(1).getName();
        int temp_age = student_manager.students.get(1).getAge();
        int temp_student_num = student_manager.students.get(1).getStudent_num();
        String temp_major = student_manager.students.get(1).getMajor();

        StudentExpel.addExpelStudent(temp_name, temp_age, temp_student_num,temp_major);

    }

    public void add_student(String name, int age, int student_num, String major){
        students.add(new Student(name,age,student_num,major));
        System.out.println("add_student = " + name);
    }
}
