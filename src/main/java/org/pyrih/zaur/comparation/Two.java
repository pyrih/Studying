package org.pyrih.zaur.comparation;

import java.util.*;

public class Two {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee(100, "Zaur", "Tregulov", 11223);
        Employee employee2 = new Employee(15, "Ivan", "Petrov", 6542);
        Employee employee3 = new Employee(123, "Mary", "Sidorova", 8542);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        System.out.println(employees);

        // with Interface Comparable
        Collections.sort(employees);

        // or with Interface Comparator
        Collections.sort(employees, new SalaryComparator()); // в этом случае только по компаратору будет сортировка, компарабел не сортирует

        System.out.println(employees);

        Arrays.sort(new Employee[] {employee1, employee2, employee3}); // или так. Но если Comparable не имплементирован, то получим RuntimeException
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if (this.id == o.id) {
            return 0;
        } else if (this.id < o.id) {
            return -1;
        }
        return 1;

        // or this.id - o.id; // если сравниваем числа int
        // or return this.id.compareTo(o.id); // если id у нас Integer
        // or если по имени this.name.compareTo(o.name); // если String. Также можно добавить дальше проверку на фамилию
        // if((this.name.compareTo(o.name)) == 0) {
        // return this.surname.compareTo(o.surname)
    }
}

class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.id == o2.id) {
            return 0;
        } else if (o1.id < o2.id) {
            return -1;
        }
        return 1;
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.compareTo(o2);
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.salary - o2.salary;
    }
}
