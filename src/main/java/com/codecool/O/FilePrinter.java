package com.codecool.O;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FilePrinter implements Printer {

    public void print(String[] data) {

        try {
            FileWriter writer = new FileWriter(new File("output.txt"));
            for (String element : data) {
                writer.write(element);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

