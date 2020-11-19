package org.pyrih.zaur.ionio;

import java.io.*;

public class DataStreamsExample {
    public static void main(String[] args) {
        try (
                DataOutputStream output = new DataOutputStream(new FileOutputStream("src/main/resources/data_1.bin"));
                DataInputStream input = new DataInputStream(new FileInputStream("src/main/resources/data_1.bin"))
        ) {
            output.writeBoolean(true);
            output.writeInt(13);
            output.writeChars("String!");

            System.out.println(input.readBoolean());
            System.out.println(input.readInt());
            System.out.println(input.readChar());
            System.out.println(input.readChar());
            System.out.println(input.readChar());
            System.out.println(input.readChar());
            System.out.println(input.readChar());
            System.out.println(input.readChar());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
