package org.example.bootcamp.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Schule {
    private static int idCount = 1;
    private final List<Student> students;
    private final Map<String, Student> studentMap;

    public Schule() {
        students = new ArrayList<>();
        studentMap = new HashMap<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public Map<String, Student> getStudentMap() {
        return studentMap;
    }

    public void addStudent(Student student) {
        this.studentMap.put(student.getStudentId(), student);
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.studentMap.remove(student.getStudentId());
        this.students.remove(student);
    }

    public Student getStudentByIdFromList(String id) {
        for (Student student : students) {
            if(student.getStudentId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public Student getStudentById(String id) {
        for(Map.Entry<String, Student> entry : studentMap.entrySet()) {
            if(entry.getValue().getStudentId().equals(id)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void printStudents() {
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            Student student = entry.getValue();
            System.out.println(student.getFirstName() + " " + student.getLastName() + " (ID: " + student.getStudentId() + ")");
        }
    }

    public void printStudentsFromList() {
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
