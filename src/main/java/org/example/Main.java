package org.example;

import org.example.bootcamp.collections.Kurs;
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

        Student studentMax = schule.getStudentById("1");
        if (studentMax != null) {
            studentMax.addKurs(new Kurs("Mathematik", "Herr Arndt", "1.01"));
            studentMax.addKurs(new Kurs("English", "Frau Muster", "2.11"));
            studentMax.addKurs(new Kurs("Programmiersprachen", "Herr Balzert", "1.23"));

            System.out.println();
            System.out.println("Kurse vom Studenten mit der ID=1: ");
            schule.getKurseByStudentId("1").forEach(System.out::println);
            System.out.println();
        }
    }
}