package org.pyrih.zaur.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] args) {
        Student a = new Student("Andrii", "M", 27, 5, 4.5);
        Student b = new Student("Kate", "F", 22, 1, 4.0);
        Student c = new Student("Viktor", "M", 27, 5, 3.5);
        Student d = new Student("Mary", "F", 26, 4, 4.7);
        Student e = new Student("Ivan", "M", 23, 2, 5.0);

        List<Student> students = new ArrayList<>();
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);
        students.add(e);

        List<Student> students1 = students.stream()
                .filter(el -> el.age > 22 && el.grade < 4.6)
                .collect(Collectors.toList());
        System.out.println(students1);

        Stream<Student> stream = Stream.of(a, b, c, d, e);
        stream.filter(elem -> elem.course > 3)
                .collect(Collectors.toList());

    }
}

class Student {
    String name;
    String sex;
    int age;
    int course;
    double grade;

    public Student(String name, String sex, int age, int course, double grade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (course != student.course) return false;
        if (Double.compare(student.grade, grade) != 0) return false;
        if (!name.equals(student.name)) return false;
        return sex.equals(student.sex);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + sex.hashCode();
        result = 31 * result + age;
        result = 31 * result + course;
        temp = Double.doubleToLongBits(grade);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", grade=" + grade +
                '}';
    }
}
