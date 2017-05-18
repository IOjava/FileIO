package JavaArrays;

import java.util.Random;

public class NameGenerator {
    public static void main(String[] args) {

        String[] adjectives = {"terrible", "environmental", "impressive", "available", "practical", "inner", "immediate", "eastern", "mad", "known"};
        String[] nouns = {"Cyclone", "League", "Musculature", "Opium", "Oval", "Possession", "Practice", "Session", "Teaching", "Wake"};

        Random random = new Random();
        int i = random.nextInt(10);


        System.out.println(adjectives[i] + "-" + nouns[i]);

    }
}
