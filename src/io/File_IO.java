package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class File_IO {

    public static String addressBook = "contactList";
    public static String contacts = "contacts.txt";

    public static void printMenu() throws IOException{
        System.out.println("1. View contacts\n2. Add a new contact\n3. Search a contact by name.\n4. Delete an existing contact.\n5. Exit.\nEnter an option (1, 2, 3, 4 or 5):");
        menuOptions();
    }
    public static void exitProgram() throws IOException{
        System.out.println("Goodbye!");
        System.exit(0);
    }
    public static void continueMenu() throws IOException{
        System.out.println("Would you like to do something else?");
        String entry = in.nextLine();
        if (entry.equalsIgnoreCase("y") || entry.equalsIgnoreCase("yes")) {
            printMenu();
        }
            exitProgram();
        }

    public static void menuOptions() throws IOException{
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

    public static String addContact() throws IOException {
        Path contactsPath = Paths.get(addressBook, contacts);
        List<String> people = Files.readAllLines(contactsPath);

        System.out.println("Add a new contact");
        System.out.println("Enter Contacts Name");
        String nameInput = in.nextLine();
        System.out.println("Enter Contacts Number");
        String phoneNumInput = in.nextLine();
        List<String> newContact = Arrays.asList(nameInput + " | " + phoneNumInput);

        for(String person: people){
            if(person.contains(nameInput) && person.contains(phoneNumInput)){
                System.out.println("There's already a contact named "+nameInput+". Do you want to overwrite it? (Yes/No)");
                String yesNoInput = in.nextLine();
                if(yesNoInput.equalsIgnoreCase("yes") || yesNoInput.equalsIgnoreCase("y")){
                    newContact.add(nameInput+phoneNumInput);
                      continue;
                }
                newContact.add(person);
            }
        }
        Files.write(
                Paths.get(addressBook, contacts),
                newContact,
                StandardOpenOption.APPEND
        );
        return nameInput;
    }


    public static void viewContact() throws IOException{
        Path contactsPath = Paths.get(addressBook, contacts);
        List<String> people = Files.readAllLines(contactsPath);
        System.out.println("Enter person's name you are looking for.\n");
        String displayContact = in.nextLine();

        for(String individual: people){
            if(individual.contains(displayContact)){
                System.out.println(individual);
            }
        }
        continueMenu();
    }

    public static void viewAllContacts() throws IOException {
        Path contactsPath = Paths.get(addressBook, contacts);
        List<String> people = Files.readAllLines(contactsPath);

        for (int i = 0; i < people.size(); i++){
            System.out.println((i +1) + ": " + people.get(i));
        }
        continueMenu();
    }

    public static void deleteContact() throws IOException {
        Path contactsPath = Paths.get(addressBook, contacts);
        List<String> people = Files.readAllLines(contactsPath);

        for (int i = 0; i < people.size(); i++){
            System.out.println((i +1) + ": " + people.get(i));
        }
        System.out.println("Enter number of contact to delete.");
        int deleteItem = in.nextInt();
        System.out.println("Is this the one you want to delete? \n" + people.get(deleteItem-1));
        people.remove(deleteItem-1);
        Files.write(
                Paths.get(addressBook, contacts),
                people
        );
        continueMenu();

    }

    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) throws IOException{



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

//      READS THE contacts.txt FILE CONTENT
        List<String> lines = Files.readAllLines(dataFile);
        for(String line : lines){
            System.out.println(line);
        }
//        Get user selection
        printMenu();



    }
}
