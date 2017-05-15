package exercise;

import java.util.Scanner;
public class Methods {


    public static void main(String[] args) {
        System.out.println("Enter a number between 1 and 10: ");
        validate(1,10);
    }

    public static void validate(int min, int max) {
        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();
        if(userInput > min && userInput < max) {
            System.out.println("Correct!!");
        } else {
            System.out.println("Number out of range. Enter another number");
            validate(min, max);
        }
    }

}
