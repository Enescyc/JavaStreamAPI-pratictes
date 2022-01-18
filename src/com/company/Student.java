package com.company;


public class Student {

    private int studentNumber;
    private String studentName;
    private String studentSurname;

    Student(int studentNumber,String studentName, String studentSurname){
        this.studentName=studentName;
        this.studentNumber=studentNumber;
        this.studentSurname=studentSurname;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }




}
