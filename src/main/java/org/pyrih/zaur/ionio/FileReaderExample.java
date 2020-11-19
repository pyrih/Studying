package org.pyrih.zaur.ionio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("src/main/resources/io_one.txt");
            int ch;

            System.out.println("Starting...");
            System.out.println();
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println("\n");
            System.out.println("Done.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
