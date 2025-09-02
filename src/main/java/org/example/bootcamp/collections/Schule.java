package org.example.bootcamp.collections;

import java.util.ArrayList;
import java.util.List;

public class Schule {
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

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }
}
