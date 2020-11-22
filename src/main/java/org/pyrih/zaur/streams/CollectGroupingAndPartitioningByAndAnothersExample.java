package org.pyrih.zaur.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectGroupingAndPartitioningByAndAnothersExample {
    public static void main(String[] args) {
        Student a = new Student("Andrew", "M", 27, 5, 4.5);
        Student b = new Student("Jane", "F", 22, 1, 4.0);
        Student c = new Student("Jack", "M", 27, 5, 3.5);
        Student d = new Student("Maria", "F", 26, 4, 4.7);
        Student e = new Student("Den", "M", 23, 2, 5.0);

        List<Student> students = new ArrayList<>();
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);
        students.add(e);

        // группировка по...
        Map<Integer, List<Student>> grouping = students.stream()
                .map(student -> { // or replace map to .peek(student -> student.name = student.name.toUpperCase())
                    student.name = student.name.toUpperCase();
                    return student;
                })
                .collect(Collectors.groupingBy(student -> student.course));

        for (Map.Entry<Integer, List<Student>> entry : grouping.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }

        System.out.println("---------------------------------------");

        // разделени по...
        Map<Boolean, List<Student>> partitioning = students.stream()
                .collect(Collectors.partitioningBy(student -> student.grade > 4));

        for (Map.Entry<Boolean, List<Student>> entry : partitioning.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }

        System.out.println("---------------------------------------");

        Student student = students.stream().findFirst().get();
        System.out.println(student.toString());

        System.out.println("---------------------------------------");

        Student minAgeStudent = students.stream().min((x, y) -> x.age - y.age).get();
        System.out.println(minAgeStudent.toString());

        System.out.println("---------------------------------------");

        Student maxAgeStudent = students.stream().max((x, y) -> x.age - y.age).get();
        System.out.println(maxAgeStudent.toString());

        System.out.println("---------------------------------------");

        students.stream()
                .filter(st -> st.age > 25)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("---------------------------------------");

        students.stream()
                .filter(st -> st.age > 25)
                .skip(2)
                .forEach(System.out::println);

        System.out.println("---------------------------------------");

        List<Integer> integers = students.stream()
                .mapToInt(value -> value.course)
                .boxed() // converts int to Integer
                .collect(Collectors.toList());
        System.out.println(integers);

        System.out.println("---------------------------------------");


    }
}
