package org.pyrih.zaur.streams;

import java.util.ArrayList;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        Student a = new Student("Andrii", "M", 27, 5, 4.5);
        Student b = new Student("Kate", "F", 22, 1, 4.0);
        Student c = new Student("Viktor", "M", 27, 5, 3.5);
        Student d = new Student("Mary", "F", 26, 4, 4.7);
        Student e = new Student("Ivan", "M", 23, 2, 5.0);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Math");

        f1.addStudent(a);
        f1.addStudent(b);
        f1.addStudent(c);

        f2.addStudent(d);
        f2.addStudent(e);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(f1);
        faculties.add(f2);

        faculties.stream()
                .flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(student -> System.out.println(student.name));
    }
}

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudent(Student student) {
        studentsOnFaculty.add(student);
    }
}
