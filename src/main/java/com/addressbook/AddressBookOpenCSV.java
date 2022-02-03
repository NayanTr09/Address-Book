package com.addressbook;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class AddressBookOpenCSV {
    public static void main(String[] args) throws Exception {
        String csv = "C:\\Users\\nayan\\IntelliJ workspace\\AddressBook\\src\\main\\resources\\AddressBook.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv));
        String record = "\n FirstName : Nayan \n LastName : Tripathi \n City: New Delhi \n Zip : 110085 \n Email : nayantripathi42@gmail.com";
        writer.writeNext(new String[]{record});
        writer.close();

        CSVReader reader = new CSVReader(new FileReader("C:\\Users\\nayan\\IntelliJ workspace\\AddressBook\\src\\main\\resources\\AddressBook.csv"));
        String[] line;
        while ((line = reader.readNext()) != null) {
            for(String lines : line) {
                System.out.println(lines);
            }
        }
    }
}
