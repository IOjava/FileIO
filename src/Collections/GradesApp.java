package Collections;

import Java2.Input;

import java.util.HashMap;
import java.util.Map;
public class GradesApp {
    private Student student;

    public static void main(String[] args) {
        Map<String, Student> students = new HashMap();

        Student jason = new Student("Jason");
        Student robin = new Student("Robin");
        Student roxana = new Student("Roxana");
        Student ian = new Student("Ian");
        Input entry = new Input();

        jason.addGrades(6, 7, 8, 10, 15, 4);
        robin.addGrades(7, 8, 9, 12, 11, 3);
        roxana.addGrades(8, 3, 5, 11, 3, 12);
        ian.addGrades(5, 2, 8, 14, 10, 8);

        students.put("cptcrunchy", jason);
        students.put("teddy-error", robin);
        students.put("roxanavp87", roxana);
        students.put("idohertyr", ian);

        System.out.println("Welcome!\n" + "\n" + "Would you like to see a list of our student's github names:");
        String answer = entry.getString();

        if (answer.equalsIgnoreCase("n")) {
            System.out.println("Goodbye, and have a wonderful day!");
            System.exit(0);
        } else {
            System.out.println("Here are the github usernames of our students:");
            students.forEach((key, value) -> {
                System.out.printf(" | %s | ", key);
            });
        }
        System.out.println("\nWhat student would you like to see more information on?");

        String answer2 = entry.getString();


        if (!students.containsKey(answer2)) {
            System.out.println("Sorry, no student found with the github username of \"" + answer2 + "\".");

        } else {
            System.out.printf("Name: %s ", students.get(answer2));
        }

    }
}
