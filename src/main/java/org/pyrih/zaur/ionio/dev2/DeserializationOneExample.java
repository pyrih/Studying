package org.pyrih.zaur.ionio.dev2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializationOneExample {
    public static void main(String[] args) {
        List<String> employees;
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/resources/employees1.bin"))
        ) {
            employees = (ArrayList) in.readObject();
            System.out.println(employees);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
