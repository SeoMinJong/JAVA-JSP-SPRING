package com.javalec.manager;

import java.util.ArrayList;

public class StudentExpel {
    static ArrayList<Student> expelStudents;

    public StudentExpel(){
        expelStudents = new ArrayList<Student>();
    }

    public static void addExpelStudent(String name, int age, int student_num, String major){
        expelStudents.add(new Student(name, age, student_num, major));
        System.out.println("EXPEL_NAME = " + name);
    }
}