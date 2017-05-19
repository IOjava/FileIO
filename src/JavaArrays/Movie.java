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
        out.format("+-------------------------------------+----------+\n");
        out.format("| Title                               | Genre    |\n");
        out.format("+-------------------------------------+----------+\n");
        String leftAlignFormat = "| %-35s | %-8s |\n";
        out.format(leftAlignFormat, this.title, modifyGenre());
        out.format("+-------------------------------------+----------+\n");


    }

    public Movie addMovie() {
        out.println("Enter Title:");
        String title = input.nextLine();
        out.println("Enter Genre:");
        String genre = input.nextLine();
        return new Movie(title, genre);
    }
    public String modifyGenre() {
        return this.genre.replaceFirst(Character.toString((genre.charAt(0))), Character.toString(Character.toUpperCase(genre.charAt(0))));
    }
}