package exercise;

import java.util.Scanner;
public class MethodsExercise {
    public static boolean makeTacos(boolean Tortillas, boolean fill, boolean salsa) {
        return (Tortillas && fill && salsa);
    }

    public static void areTheTacosReady(boolean answer, String client) {
        if(answer){
            System.out.println("Tacos are ready!");
            System.out.println(serve(client));
        }else{
            System.out.println("Tacos are NOT ready!");
        }
    }
    public static String serve(String client){
        return client + " was notified";
    }

    public static String askClientName(Scanner in){
        System.out.println("Please enter your name: ");
        String client = in.nextLine();
        return client;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean answerC1 = makeTacos(true,true,true);

        areTheTacosReady(answerC1, askClientName(in));
        areTheTacosReady(makeTacos(false,true,true), askClientName(in));
    }
}
