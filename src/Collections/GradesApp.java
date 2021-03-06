package Collections;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class GradesApp {
    public static Scanner entry = new Scanner(System.in);

    public static void getStudentInfo(Map<String, Student> students) {
        System.out.println("Here are the Github usernames of our students:");
        printStudentList(students);
    }

    public static void printStudentList(Map<String, Student> students) {
        students.forEach((key, value) -> System.out.printf(" | %-14s | \n", key));
        System.out.println("\nWhat student would you like to see more information on?\n(Enter 'All' for complete list)");
        String answer = entry.nextLine();

        if ("All".equalsIgnoreCase(answer)) {
            students.forEach((username, student) -> System.out.printf(" | %-14s | \n", username));

        } else if (students.get(answer) == null) {
            System.out.println("Sorry, no student found with the github username of \"" + answer + "\".");
            seeMoreStudents(students);

        } else {
            System.out.printf("Name: %s\nGithub Username: %s\nCurrent Average: %.2f\n", students.get(answer).getName(), answer, students.get(answer).getGradeAverage());
        }
        seeMoreStudents(students);
    }

    public static void seeMoreStudents(Map<String, Student> students) {
        System.out.println("Would you like to see another student?");
        String answer = entry.nextLine();

        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            printStudentList(students);
        } else if (!answer.equalsIgnoreCase("y") || !answer.equalsIgnoreCase("yes")) {
            System.out.println("Sorry. " + answer + " is not a valid command.\n");
            seeMoreStudents(students);
        }else if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")){
            System.out.println("Goodbye, and have a wonderful day!");
            System.exit(0);
        }else
        entry.next();
    }

    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();

        Student jason = new Student("Jason");
        Student robin = new Student("Robin");
        Student roxana = new Student("Roxana");
        Student ian = new Student("Ian");

        students.put("cptcrunchy", jason);
        students.put("teddy-error", robin);
        students.put("roxanavp87", roxana);
        students.put("idoherty", ian);


        jason.addGrades(88, 95, 99, 94, 86, 94);
        robin.addGrades(97, 98, 89, 92, 91, 83);
        roxana.addGrades(98, 83, 95, 91, 93, 82);
        ian.addGrades(95, 92, 88, 94, 90, 88);


        System.out.println("Welcome");
        getStudentInfo(students);
    }
}
