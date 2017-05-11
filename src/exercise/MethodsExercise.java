package exercise;


public class MethodsExercise {
    public static boolean makeTacos(boolean Tortillas, boolean fill, boolean salsa) {
        if(Tortillas && fill && salsa) {
            System.out.println("Tacos are ready!");
            return true;
        }else {
            System.out.println("Tacos are NOT ready.");
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println( makeTacos(true,true,true));
    }
}
