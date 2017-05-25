package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class File_IO {

    public static void printMenu(){
        System.out.println("1. View contacts\n2. Add a new contact\n3. Search a contact by name.\n4. Delete an existing contact.\n5. Exit.\nEnter an option (1, 2, 3, 4 or 5):\n");
    }

    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) throws IOException{

        String addressBook = "contactList";
        String contacts = "contacts.txt";

        Path dataDirectory = Paths.get(addressBook);
        Path dataFile = Paths.get(addressBook, contacts);

//        IF DIRECTORY OR FOLDER DOES NOT EXIST. MAKE IT!
        if (Files.notExists(dataDirectory)){
            Files.createDirectories(dataDirectory);
        }
//        IF FILE DOES NOT EXIST. MAKE IT!
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

        System.out.println("Add a new contact");
        System.out.println("Enter Contacts Name");
        String nameInput = in.nextLine();
        System.out.println("Enter Contacts Number");
        String phoneNumInput = in.nextLine();
        List<String> contactList = Arrays.asList(nameInput+","+phoneNumInput);

        Files.write(
                Paths.get(addressBook, contacts),
                contactList,
                StandardOpenOption.APPEND
        );
    }
}
