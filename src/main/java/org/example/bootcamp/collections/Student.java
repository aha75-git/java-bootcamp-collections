package org.example.bootcamp.collections;

public class Student {
    private String firstName;
    private String lastName;
    private String studentId;

    public Student(String firstName, String lastName, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
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
}
