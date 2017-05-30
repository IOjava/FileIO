package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.*;

public class File_IO {

    private static String addressBook = "contactList";
    private static String contacts = "contacts.txt";

    private static void printMenu() throws IOException{
        System.out.println("1. View contacts\n2. Add a new contact\n3. Search a contact by name.\n4. Delete an existing contact.\n5. Exit.\nEnter an option (1, 2, 3, 4 or 5):");
        menuOptions();
    }

    private static void exitProgram() throws IOException{
        System.out.println("Goodbye!");
        System.exit(0);
    }

    private static void continueMenu() throws IOException{
        System.out.println("Would you like to do something else?");
        String entry = in.nextLine();
        if (entry.equalsIgnoreCase("y") || entry.equalsIgnoreCase("yes")) {
            printMenu();
        }
            exitProgram();
        }

    private static void menuOptions() throws IOException{
        String entry = in.nextLine();

        switch(entry){
            case "1":
                viewAllContacts();
                break;
            case "2":
                addContact();
                break;
            case "3":
                viewContact();
                break;
            case "4":
                deleteContact();
                break;
            case "5":
                exitProgram();
            default:
                exitProgram();
        }
    }

    private static void addContact() throws IOException {
        System.out.println("Add a new contact");
        System.out.println("Enter Contacts Name");
        String nameInput = in.nextLine();
        System.out.println("Enter Contacts Number");
        String phoneNumInput = in.nextLine();
        List<String> newContact = Collections.singletonList(nameInput+" | "+phoneNumInput);

        Files.write(
            Paths.get(addressBook,contacts),
            newContact,
            StandardOpenOption.APPEND
        );
        continueMenu();
    }


    private static void viewContact() throws IOException{
        Path contactsPath = Paths.get(addressBook, contacts);
        List<String> people = Files.readAllLines(contactsPath);
        System.out.println("Enter person's name you are looking for.");
        String displayContact = in.nextLine();

        for(String individual: people){
            if(individual.contains(displayContact)){
                System.out.println(individual);
            }
        }
        continueMenu();
    }

    private static void viewAllContacts() throws IOException {
        Path contactsPath = Paths.get(addressBook, contacts);
        List<String> people = Files.readAllLines(contactsPath);
        String name = "Name";
        String number = "Phone number";
        System.out.printf("%-12s | %-12s\n", name, number);
        for (int i = 0; i < people.size(); i++){
            System.out.println(String.format("%s | ",people.get(i)));
        }
        continueMenu();
    }

    private static void deleteContact() throws IOException {
        Path contactsPath = Paths.get(addressBook, contacts);
        List<String> people = Files.readAllLines(contactsPath);

        for (int i = 0; i < people.size(); i++){
            System.out.println((i +1) + ": " + people.get(i));
        }

        System.out.println("Enter number of contact to delete.");
        int deleteItem = in.nextInt();
        System.out.println("Is this the one you want to delete?\n" + people.get(deleteItem-1));
        String entry = in.next();

        if(entry.equalsIgnoreCase("yes") || entry.equalsIgnoreCase("y")) {
            people.remove(deleteItem-1);
            Files.write(Paths.get(addressBook, contacts),people);
            in.nextLine();
        }else{
            if(!entry.equalsIgnoreCase("y") || !entry.equalsIgnoreCase("yes")){
                deleteContact();
            }
        }
        continueMenu();


    }

    private static void createFile() throws IOException{
        Path dataDirectory = Paths.get(addressBook);
        Path dataFile = Paths.get(addressBook, contacts);

//        IF DIRECTORY OR FOLDER DOES NOT EXIST. MAKE IT!
        if (Files.notExists(dataDirectory)){
            Files.createDirectories(dataDirectory);
        }
//        IF FILE DOES NOTEXIST. MAKE IT!
        if (Files.notExists(dataFile)){
            Files.createFile(dataFile);
        }
    }
    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) throws IOException{
        createFile();
        printMenu();
    }
}
