package org.pyrih.zaur.ionio.dev1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTwoExample {
    public static void main(String[] args) {
        Employee employee = new Employee("Mary", "IT", 28, 500,
                new Car("Nissan Tiida", "White"));

        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("src/main/resources/employees2.bin"))
        ) {
            os.writeObject(employee);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
