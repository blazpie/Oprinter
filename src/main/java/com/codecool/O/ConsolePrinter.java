package com.codecool.O;

public class ConsolePrinter implements Printer {

    public void print(String[] data) {
        for (String elem : data) {
            System.out.println(elem);
        }
    }
}
