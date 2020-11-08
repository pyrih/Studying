package org.pyrih.zaur.generics.game;

public class Runner {
    public static void main(String[] args) {
        Scholar sc1 = new Scholar("Ivan", 13);
        Scholar sc2 = new Scholar("Mary", 15);

        Student st1 = new Student("Nikola", 20);
        Student st2 = new Student("Oxi", 18);

        Employee em1 = new Employee("Zaur", 32);
        Employee em2 = new Employee("Miha", 47);

        Team<Scholar> scholars = new Team<>("Dragons");
        scholars.addParticipant(sc1);
        scholars.addParticipant(sc2);

        Team<Student> students = new Team<>("Let's go");
        students.addParticipant(st1);
        students.addParticipant(st2);

        Team<Employee> employees = new Team<>("Workers");
        employees.addParticipant(em1);
        employees.addParticipant(em2);

        Scholar sc3 = new Scholar("Serg", 12);
        Scholar sc4 = new Scholar("Dima", 14);

        Team<Scholar> scholars2 = new Team<>("Nerds");
        scholars2.addParticipant(sc3);
        scholars2.addParticipant(sc4);

        scholars.playWith(scholars2);

    }
}
