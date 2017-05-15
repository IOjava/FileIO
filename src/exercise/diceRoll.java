package exercise;
import java.util.Scanner;

public class diceRoll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sideCount;
        String condition;
        int min = 1;
        do {
            System.out.printf("Enter the number of sides for a pair of dice \n");
            sideCount = in.nextInt();
            System.out.println("Rolling the dice...\n" +
                    random(min, sideCount) + " and " + random(min, sideCount));
            System.out.println("Type exit to finish or roll again...");
            in.nextLine();
            condition = in.nextLine();
        } while (!condition.equalsIgnoreCase("exit"));

    }
    private static int random(int min, int max) {

        return (int) Math.round(Math.random()*(max - min)) + min;
    }

}




