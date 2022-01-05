package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {
    public String Firstname, Address, Email;
    public String Lastname, City, Zip;

    public Contacts(String Firstname2, String Lastname2, String Address2, String City2, String Zip2, String Email2) {
        this.Firstname = Firstname2;
        this.Lastname = Lastname2;
        this.Address = Address2;
        this.Email = Email2;
        this.City = City2;
        this.Zip = Zip2;

        System.out.println("New Contact added successfully with details :");
        System.out.println("first name " + this.Firstname);
        System.out.println("Second name " + this.Lastname);
        System.out.println("Address " + this.Address);
        System.out.println("City " + this.City);
        System.out.println("Zip Code " + this.Zip);
        System.out.println("Email " + this.Email);
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String FirstName) {
        this.Firstname = FirstName;
    }

    public String toString() {

        return "Contact [name=" + this.Firstname + ", address=" + this.Address + "]";
    }
}
