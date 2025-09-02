package org.example;

import org.example.bootcamp.collections.Schule;
import org.example.bootcamp.collections.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Schule schule = new Schule();
        schule.addStudent(new Student("Max", "Mustermann", String.valueOf(Schule.generateStudentId())));
        schule.addStudent(new Student("Julia", "Müller", String.valueOf(Schule.generateStudentId())));
        schule.addStudent(new Student("Peter", "Möller", String.valueOf(Schule.generateStudentId())));
        // alle Studenten der Schule ausgeben
        System.out.println("Alle Studenten der Schule:");
        schule.printStudents();
        System.out.println();

        System.out.println("Student mit der ID=2 wird gesucht.");
        Student student = schule.getStudentById("2");
        if (student == null) {
            System.out.println("Es gibt keinen Studenten mit der ID=2 in dieser Schule.");
        } else {
            System.out.println(student);
        }

        System.out.println();
        schule.removeStudent(student);
        schule.printStudents();
        System.out.println();

        System.out.println("Student mit der ID=2 wird gesucht.");
        student = schule.getStudentById("2");
        if (student == null) {
            System.out.println("Es gibt keinen Studenten mit der ID=2 in dieser Schule");
        } else {
            System.out.println(student);
        }

    }
}