package org.pyrih.io;

import java.io.*;
import java.util.zip.ZipOutputStream;

public class Demo {

    public static void main(String[] args) throws IOException {
        File file = new File("app.properties");


        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            System.setOut(new PrintStream(new ZipOutputStream(fileOutputStream)));
        }
    }
}
