package org.pyrih.zaur.ionio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно! —\n" +
                "Вот последняя правда, открытая мной.\n\n";

        String string = "Всем известно, что красота спасет мир, но никто не знает, от чего.";

        FileWriter writer = null;
        try {
            writer = new FileWriter("src/main/resources/io_one.txt"); // перезаписывает файл
//            writer = new FileWriter("src/main/resources/io_one.txt", true); // пишет далее в файл

            // 1
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i)); // здесь char приводится автоматически к int
            }

            // 2
            writer.write(rubai); // всеравно посимвольно будет записываться как в первом примере

            // 3
            writer.write(string);

            System.out.println("Writing to file has done!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close(); // если не закрывать стрим, то будет создан файл, но записано у него ничего не будет!
        }
    }
}
