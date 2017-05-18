package JavaArrays;
import java.io.PrintStream;
import java.util.Scanner;

public class Movie {
    private String title;
    private String category;
    private PrintStream out;
    private Scanner input;

    public Movie(String title, String category) {
        this.title =title;
        this.category = category;
        this.out = System.out;
        this.input = new Scanner(System.in);
    }

    public String getCategory() {
        return this.category;
    }

    public void printMovie() {
        out.println("**********************\n" +
                "Movie title: "+this.title + "\n" +
                "Movie category: "+ modifyCategory() +
                "\n**********************\n");
    }
    public String modifyCategory() {
        return this.category.replaceFirst(Character.toString((category.charAt(0))), Character.toString(Character.toUpperCase(category.charAt(0))));
    }

    public Movie addMovie() {
        out.println("Enter title:");
        String title = input.nextLine();
        System.out.println("Enter category:");
        String category = input.nextLine();
        return new Movie(title, category);
    }
}
