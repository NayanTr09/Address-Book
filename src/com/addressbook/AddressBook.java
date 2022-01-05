package com.addressbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
    public static void main(String args[]) {
        System.out.println("This is a Address Book ");
        ArrayList<Contacts> contact = new ArrayList<Contacts>();
        Scanner in = new Scanner(System.in);
        int Flag = 0;
        while(Flag != 1) {
            System.out.println("Kindly Enter choice \n 1. Add details to contact list \n 2. Edit details \n 3. Display details \n 4. Quit");
            int AddDetails = in.nextInt();
            if (AddDetails == 1) {
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
                contact.add(details);
            } else if (AddDetails == 2) {
                System.out.println("Enter first name of the user in contact list");
                String Namelookup = in.next();
                for (int i = 0; i < contact.size(); i++) {
                    if (Namelookup.equals(String.valueOf(contact.get(i).getFirstname()))) {
                        System.out.println("Enter updated first name");
                        String UpdatedFirstName = in.next();
                        contact.get(i).setFirstname(UpdatedFirstName);
                        System.out.println(contact.get(i));
                    }
                }
            }
            else if(AddDetails == 3) {
                for (Contacts details : contact) {
                    System.out.println(details.toString());
                }
            }
            else if (AddDetails == 4)
            {
                Flag=1;
            }
        }
    }
}