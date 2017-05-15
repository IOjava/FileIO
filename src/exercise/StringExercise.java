package exercise;

import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        // Declarations
        Scanner in = new Scanner(System.in);


//              TALKING WITH BOB

        System.out.printf("\n" +
                "************************\n" +
                "*    TALKIN WITH BOB   *\n" +
                "************************\n\n");
        System.out.println("Yo! My dad calls me Bob. #parents\n");

        String bobQuestion = "Sure";
        String bobYelling = "Whoa, chill bro!";
        String bobEmptyStr = "Bro, you trollin' me? Its just a chat!";
        String bobFormal = "Bro, its just Bob. Keep it casual.";
        String bobDefault = "Whatever, bro.";

        String userInput;
        String parentsInput;

        do {

        System.out.println("Talk to Bob:");
        parentsInput = in.nextLine();
        System.out.println(parentsInput);

        if (parentsInput.endsWith("?")) {
            System.out.println(bobQuestion);
        }else if(parentsInput.trim().isEmpty()) {
            System.out.println(bobEmptyStr);
        } else if(parentsInput.endsWith("!") ||
                parentsInput.toUpperCase().equals(parentsInput)) {
                System.out.println(bobYelling);
        } else if(parentsInput.toLowerCase().contains("robert")) {
            System.out.println(bobFormal);
        } else {
            System.out.println(bobDefault);
        }



        System.out.println("Talk with Bob again? (y/n)");
            userInput = in.nextLine();

        }while(userInput.equalsIgnoreCase("y"));




    }
}
