package org.example;

public class Student implements Cloneable{
    private String name;
    private int age;
    private String studentId;
    private String major;
    private String grade;

    public Student(String name, int age, String studentId, String major, String grade) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.major = major;
        this.grade = grade;
    }

    // it can have getter and setter methods
    // but in this it is not necessary


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
