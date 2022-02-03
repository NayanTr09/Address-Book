package com.addressbook;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class AddressBookGSON {
    public static void main(String[] args) throws Exception {
        String jsonString = "{\"Firstname\":\"Nayan\", \"Lastname\":Tripathi, \"City\":NewDelhi}";
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        Contacts contacts = gson.fromJson(jsonString, Contacts.class);
        System.out.println("My Contacts from JSON " +contacts);
        jsonString = gson.toJson(contacts);
        System.out.println(jsonString);

        Gson Gson = new GsonBuilder()
                .create();
        Contacts contact = Gson.fromJson("{\"Firstname\":\"Nayan\", \"Lastname\":Tripathi, \"City\":NewDelhi}", Contacts.class);
        System.out.println(contact);
    }
}