package org.example.bootcamp.collections;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String studentId;
    private final List<Kurs> kurse;

    public Student(String firstName, String lastName, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.kurse = new ArrayList<>();
    }

    public boolean addKurs(Kurs kurs) {
        return this.kurse.add(kurs);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Vorname='" + firstName + '\'' +
                ", Nachname='" + lastName + '\'' +
                ", Studenten-ID='" + studentId + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public List<Kurs> getKurse() {
        return kurse;
    }
}
