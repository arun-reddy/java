package com.arun;

import java.util.ArrayList;

/**
 * Created by ARUN REDDY on 3/17/2017.
 */
public class MobilePhone {

    private ArrayList<String> contacts = new ArrayList<String>();

    public ArrayList<String> getContacts() {
        return contacts;
    }

    public void addContacts(String name) {
        contacts.add(name);
    }

    public void printContacts() {
        System.out.println("You have " + contacts.size() + " contacts in your phonebook.");
        for (int i = 0; i < contacts.size(); i++)
            System.out.println((i + 1) + ". " + contacts.get(i));
    }

    public void updateContacts(String oldContact, String newContact) {
        int position = contacts.indexOf(oldContact);
        if (position >= 0) {
            updateContacts(position, newContact);
        } else
            System.out.println("the contact is not in the phonebook");
    }

    private void updateContacts(int position, String newContact) {
        contacts.set(position, newContact);
        System.out.println("the contact name has been successfully updated to " + newContact + ".");
    }

    public void removeContacts(String name) {
        int position = contacts.indexOf(name);
        if (position >= 0) {
            removeContacts(position, name);
        } else
            System.out.println("the contact is not in the phonebook");
    }

    private void removeContacts(int position, String name) {
        contacts.remove(position);
        System.out.println("the contact " + name + " has been succesfully deleted.");
    }

    public void findContacts(String name) {
        int position = contacts.indexOf(name);
        if (position >= 0)
            System.out.println("the contact is found . It is " + position + 1 + "th contact in the phone book");
        else {
            System.out.println("contact not found");
        }
    }
}

