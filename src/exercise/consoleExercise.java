package exercise;

import java.io.PrintStream;
import java.util.Scanner;
public class consoleExercise {
    public static void main(String[] args) {
        // Declarations
        Scanner in = new Scanner(System.in);

        float length;
        float width;
        float height;


        // Prompts
        PrintStream printStream = System.out;

        printStream.println("Enter room dimensions in ft.");
        printStream.println("Enter length first. Decimals are OK.");

        // Read in values

        length = in.nextFloat();
        printStream.println("Now enter the width.");
        width = in.nextFloat();
        printStream.println("Now enter the height.");
        height = in.nextFloat();

        printStream.println("Here are the calculated dimensions: ");
        printStream.printf("area = %.2f"+" sq/ft%n", length*width);

        printStream.printf("perimeter= 2*%.2f + 2*%.2f = %.2fft\n", length, width, (length*2)+(width*2));

        printStream.println("volume= " + (length * width * height) + " cu/ft");

    }
}
