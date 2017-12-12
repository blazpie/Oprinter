package com.codecool.O;

public class StringList{

    private String[] data =new String[] {"a", "b", "c", "d", "e", "f"};
    private Printer printer;

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void printData() {
        printer.print(data);
    }


}
