package org.example.bootcamp.collections;

import java.util.ArrayList;
import java.util.List;

public class Schule {
    private static int idCount = 1;
    private final List<Student> students;

    public Schule() {
        students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public boolean addStudent(Student student) {
        return this.students.add(student);
    }

    public boolean removeStudent(Student student) {
        return this.students.remove(student);
    }

    public Student getStudentById(String id) {
        for (Student student : students) {
            if(student.getStudentId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " (ID: " + student.getStudentId() + ")");
        }
    }

    public List<Kurs> getKurseByStudentId(String studentID) {
        Student student = getStudentById(studentID);
        if(student == null) {
            return new ArrayList<>();
        }
        return student.getKurse();
    }

    public static int generateStudentId() {
        return idCount++;
    }
}
