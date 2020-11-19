package org.pyrih.zaur.ionio.dev2;

import org.pyrih.zaur.ionio.dev1.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializationTwoExample {
    public static void main(String[] args) {
        Employee employee;
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/resources/employees2.bin"))
        ) {
            employee = (Employee) in.readObject();
            System.out.println(employee);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
