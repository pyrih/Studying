package org.pyrih.zaur.ionio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndReaderTryWithResourcesExample {
    public static void main(String[] args) throws IOException {
        // FILE WRITER
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно! —\n" +
                "Вот последняя правда, открытая мной.\n\n";

        String string = "Всем известно, что красота спасет мир, но никто не знает, от чего.\n";

        try(FileWriter writer = new FileWriter("src/main/resources/io_one.txt", true);
            FileReader reader = new FileReader("src/main/resources/io_one.txt")) {
            // 2
            writer.write(rubai); // всеравно посимвольно будет записываться как в первом примере

            // 3
            writer.write(string);

            System.out.println("Writing to file has done!");


            // FILE READER
            int ch;

            System.out.println("Starting...");
            System.out.println();
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println("\n");
            System.out.println("Done.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
