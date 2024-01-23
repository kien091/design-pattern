package org.example;

public class ClientTest {
    public static void main(String[] args) {
        Student student = new Student("John", 20, "123456", "Computer Science", "A");
        System.out.println(student);

        Student studentClone = student.clone();
        System.out.println(studentClone);
    }
}