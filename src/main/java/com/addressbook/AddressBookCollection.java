package com.addressbook;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookCollection {
    public static void main(String arg[]) {
        CreateAddressBook();
    }

    public static void CreateAddressBook() {
        String AddContact;
        String AddressBookName;
        MultiValuedMap<String, String> contacts = new ArrayListValuedHashMap<>();
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the name for AddressBook");
            AddressBookName = in.next();
            System.out.println("Enter first name");
            String Firstname = in.next();
            System.out.println("Enter last name");
            String Lastname = in.next();
            System.out.println("Enter address");
            String Address = in.next();
            System.out.println("Enter City");
            String City = in.next();
            System.out.println("Enter Zip code");
            String Zip = in.next();
            System.out.println("Enter email");
            String Email = in.next();
            Contacts details = new Contacts(Firstname, Lastname, Address, City, Zip, Email);
            if(!contacts.containsKey(AddressBookName)){
                contacts.put(AddressBookName,Firstname);
                contacts.put(AddressBookName,Lastname);
                contacts.put(AddressBookName,Address);
                contacts.put(AddressBookName,City);
                contacts.put(AddressBookName,Zip);
                contacts.put(AddressBookName,Email);
            }
            else {
                System.out.println("AddressBook with this name already exists! This will not create Duplicate AddressBook");
            }
            System.out.println("Enter a new contact? (Y/N)");
            AddContact = in.next();
        }
        while (AddContact.equalsIgnoreCase("Y"));

        for (Map.Entry<String, String> entry : contacts.entries()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
