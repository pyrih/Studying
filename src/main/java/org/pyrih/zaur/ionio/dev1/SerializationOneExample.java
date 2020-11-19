package org.pyrih.zaur.ionio.dev1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationOneExample {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Zaur");
        employees.add("Ivan");
        employees.add("Lena");

        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("src/main/resources/employees1.bin"))
        ) {
            os.writeObject(employees);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
