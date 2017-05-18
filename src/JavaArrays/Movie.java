package JavaArrays;
import java.io.PrintStream;
import java.util.Scanner;

public class Movie {
    private String title;
    private String genre;
    private PrintStream out;
    private Scanner input;

    public Movie(String title, String genre) {
        this.title =title;
        this.genre = genre;
        this.out = System.out;
        this.input = new Scanner(System.in);
    }

    public String getGenre() {return this.genre;}

    public void printMovie() {
        out.println("**********************\n" +
                "Movie Title: "+this.title + "\n" +
                "Movie Genre: "+ modifyGenre() +
                "\n**********************\n");
    }

    public Movie addMovie() {
        out.println("Enter Title:");
        String title = input.nextLine();
        System.out.println("Enter Genre:");
        String genre = input.nextLine();
        return new Movie(title, genre);
    }
    public String modifyGenre() {
        return this.genre.replaceFirst(Character.toString((genre.charAt(0))), Character.toString(Character.toUpperCase(genre.charAt(0))));
    }
}
