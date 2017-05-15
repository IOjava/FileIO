package exercise;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = in.nextInt();
        int fact;
        fact = calculate(number);
        System.out.println("Factorial of "+number+" is: "+fact);

    }

    private static int calculate(int n){
        if(n == 0)
            return 1;
        else if (n == 1)
            return 1;
        else
            return (n* calculate(n-1));

    }

}
