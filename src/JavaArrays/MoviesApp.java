package JavaArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

    class MoviesApp {
        public static void main(String[] args) {
            Scanner entry = new Scanner(System.in);
            int userInput;
            boolean exit = false;
            Movie movie = new Movie("", "");
            String[] genres = {"animated", "comedy", "drama", "horror", "musical","sci-fi" };
            String menu =
                    "Please choose an option: \n" +
                    "0) Exit   | 1) All Movies\n" +
                    "**** MOVIES BY GENRE ****\n" +
                    "2) Animated  | 3) Comedy \n" +
                    "4) Drama     | 5) Horror \n" +
                    "6) Musical   | 7) Sci-fi \n" +
                    "*************************\n" +
                    "8) Add movies\n";

            ArrayList<Movie> movies = new ArrayList<>(Arrays.asList(MoviesArray.findAll()));
            System.out.println("Welcome to MoviePhone!\n");
            do {
                System.out.println(menu + "Enter your choice:");
                userInput = entry.nextInt();

                for (int i = 0; i < movies.size(); i++) {
                    if (userInput == 0) {
                        exit = true;
                        break;
                    } else if(userInput == 1) {
                        movies.get(i).printMovie();
                    } else if(userInput >=2 && userInput <= 7) {
                        if(movies.get(i).getCategory().equals(genres[userInput-2])) {
                            movies.get(i).printMovie();
                        }
                    } else if(userInput == 8) {
                        movies.add(movie.addMovie());
                        break;
                    } else {
                        System.out.println("Choose a valid option");
                        break;
                    }
                }
            } while (!exit);

        }
    }
