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
        schule.addStudent(new Student("Max", "Mustermann", UUID.randomUUID().toString()));
        schule.addStudent(new Student("Julia", "Müller", UUID.randomUUID().toString()));
        schule.addStudent(new Student("Peter", "Möller", UUID.randomUUID().toString()));
        // alle Studenten der Schule ausgeben
        System.out.println("Alle Studenten der Schule:");
        schule.printStudents();
    }
}