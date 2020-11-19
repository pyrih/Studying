package org.pyrih.zaur.ionio;

import java.io.*;

public class BufferedCopyExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/io_two.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/io_three.txt"))
        ) {
            // 1 посимвольно
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
                writer.write(ch);
            }

            // 2 построчно
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
            }

            System.out.println();
            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
