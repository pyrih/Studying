package org.pyrih.zaur.ionio;

import java.io.*;

public class FileInOutStreamsExample {
    public static void main(String[] args) {
        try (
                BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("src/main/resources/image1.jpg"));
                FileOutputStream outputStream = new FileOutputStream("src/main/resources/image2.jpg")
        ) {
            int i;
            while ((i = inputStream.read()) != -1 ) {
                outputStream.write(i);
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
