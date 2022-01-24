package com.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    public static void main(String args[]) {
        System.out.println("This is a Address Book ");
        ArrayList<Contacts> contact = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int Flag = 0;
        while(Flag != 1) {
            System.out.println("Kindly Enter choice : \n 1. Add details to contact list \n 2. Edit details \n 3. Display details \n 4. Remove Contact \n 5. Quit");
            int choice = in.nextInt();
            if (choice == 1) {
                String AddContact;
                do {
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
                    System.out.println("Enter a new contact? (Y/N)");
                    AddContact = in.next();
                }
                while (AddContact.equalsIgnoreCase("Y"));
            }
            else if (choice == 2) {
                System.out.println("Enter Email of the user in contact list");
                String EmailAddress = in.next();
                for (int i = 0; i < contact.size(); i++) {
                    if (EmailAddress.equalsIgnoreCase(String.valueOf(contact.get(i).getEmail()))) {
                        System.out.println("Enter updated first name");
                        String UpdatedFirstName = in.next();
                        contact.get(i).setFirstname(UpdatedFirstName);
                        System.out.println("Enter updated last name");
                        String UpdatedLastName = in.next();
                        contact.get(i).setLastname(UpdatedLastName);
                        System.out.println("Enter updated Email");
                        String UpdatedEmail = in.next();
                        contact.get(i).setEmail(UpdatedEmail);
                        System.out.println("Enter updated City");
                        String UpdatedCity = in.next();
                        contact.get(i).setCity(UpdatedCity);
                        System.out.println("Enter updated Zip");
                        String UpdatedZip = in.next();
                        contact.get(i).setZip(UpdatedZip);
                    }

                }
            }
            else if(choice == 3) {
                for (Contacts details : contact) {
                    System.out.println(details.toString());
                }
            }
            else if (choice == 4) {
                System.out.println("Enter Email of the user in contact list");
                String EmailAddress = in.next();
                for (int i = 0; i < contact.size(); i++) {
                    if (EmailAddress.equalsIgnoreCase(String.valueOf(contact.get(i).getEmail()))) {
                        contact.remove(i);
                    }
                    System.out.println("Contact deleted successfully!");
                }
            }
            else if (choice == 5)
            {
                Flag=1;
            }
        }
    }
}