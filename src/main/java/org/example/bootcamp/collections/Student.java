package org.example.bootcamp.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, studentId);
    }
}
