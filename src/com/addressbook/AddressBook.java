package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static void main(String args[]){
        System.out.println("This is a Address Book ");
            ArrayList<Contacts> contact = new ArrayList<Contacts>();
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number of persons: ");
            int numofpersons = in.nextInt();

            for(int i=0;i<numofpersons;i++){
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
                Contacts details = new Contacts(Firstname,Lastname,Address,City,Zip,Email);
                contact.add(details);
            }
            for(Contacts details : contact){
                System.out.println(details.toString());
            }
    }
}
