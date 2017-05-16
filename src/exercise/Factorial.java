package exercise;
import java.util.Scanner;

public class Factorial {
        public static void main(String[] args) {
            int x = 5 * 4 % 3;
            System.out.println(x);
        }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String wantsToContinue;
//        long number;
//        PrintStream out = System.out;
//        do {
//        number = getNumber(out, Scanner in);
//        System.out.println(number + "! = " + calculate(number));
//        wantsToContinue = in.next();
//        }while("y".equalsIgnoreCase(wantsToContinue));
//    }
//
//    public static long calculate(long number){
//        int fact = 1;
//        for(int i = 1; i <= number; i++) {
//        fact = fact * i;
//        }
//        return fact;
//
//    }
//    public static long getNumber(PrintStream out, Scanner in) {
//        output.println("Enter number: ");
//        return in.nextLong();
//    }

}
