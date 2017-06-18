package com.arun;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static MobilePhone phoneBook = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printOptions();
        while (!quit) {
            System.out.println("\nEnter your choice");
            choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 0:
                    printOptions();
                    break;
                case 1:
                    phoneBook.printContacts();
                    break;
                case 2:
                    addContacts();
                    break;
                case 3:
                    updateContacts();
                    break;
                case 4:
                    deleteContacts();
                    break;
                case 5:
                    findContacts();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("please enter the valid choice from the options shown above.");
            }
        }
    }

    public static void printOptions() {
        System.out.println("\nPress");
        System.out.println("\t 0- To display menu options.");
        System.out.println("\t 1- To display all the contacts");
        System.out.println("\t 2- To add new contacts.");
        System.out.println("\t 3- To update/modify existing contacts.");
        System.out.println("\t 4- To delete the contacts.");
        System.out.println("\t 5- To find the contacts in the phonebook");
        System.out.println("\t 6- To quit the menu.");
    }

    public static void addContacts(){
        System.out.println("Enter the contact name you want to add: \r");
        phoneBook.addContacts(s.nextLine());
    }

    public static void updateContacts(){
        System.out.println("Enter the name you want to update/modify");
        String oldName= s.next();
        System.out.println("Enter the new contact name.");
        String newName = s.next();
        phoneBook.updateContacts(oldName,newName);

    }
    public static void deleteContacts(){
        System.out.println("Enter the name you want to delete.");
        String name = s.next();
        phoneBook.removeContacts(name);
    }
    public static void findContacts(){
        System.out.println("Enter the name you want to find.");
        String name = s.next();
        phoneBook.findContacts(name);
    }
}

