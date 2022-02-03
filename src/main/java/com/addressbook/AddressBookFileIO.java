package com.addressbook;

import java.io.*;

public class AddressBookFileIO {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\nayan\\IntelliJ workspace\\AddressBook\\src\\main\\resources\\AddressBook.txt"));
            writer.write("\n FirstName : Nayan \n LastName : Tripathi \n City: New Delhi \n Zip : 110085 \n Email : nayantripathi42@gmail.com");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\nayan\\IntelliJ workspace\\AddressBook\\src\\main\\resources\\AddressBook.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}