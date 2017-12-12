package com.codecool.O;

public class App 
{
    public static void main( String[] args )
    {
        StringList listunia = new StringList();

        listunia.setPrinter(new FilePrinter());
        listunia.printData();
    }
}
