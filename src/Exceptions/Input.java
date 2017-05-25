package Exceptions;

import java.util.Scanner;

public class Input {

    private final Scanner in;

    public Input(){in = new Scanner(System.in);}

    public  String getString() {return in.nextLine();}

    public boolean yesNo(){
        String answer = this.getString();
        if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            return true;
        }
        return false;
    }

    public int getInt() {
        try
        {
           return Integer.valueOf(this.getString());
        }
        catch (NumberFormatException exception)
        {
            System.out.println("Integers only, please try again.");
            return getInt();
        }
    }

    public double getDouble(){
        try
        {
            return Double.valueOf(this.getString());
        }
        catch (NumberFormatException exception)
        {
            System.out.println("Doubles only, please try again.");
            return getDouble();
        }
    }

    public int getInt(int min, int max){
        int getValue;
        try
        {
          getValue = Integer.valueOf(this.getString());
        } catch (NumberFormatException exception) {
            System.out.println("Please enter a number between " + min + " and " + max);
            return getInt(min, max);
        }
        if(getValue >= min && getValue <= max){
            return getValue;
        }
        System.out.println(getValue + " is out of range. Try again");
            return getInt(min,max);
    }

    public double getDouble(double min, double max){
        double getValue;
        try
        {
          getValue = Integer.valueOf(this.getString());
        } catch (NumberFormatException exception) {
            System.out.println("Please enter a number between " + min + " and " + max);
            return getDouble(min, max);
        }
        if(getValue >= min && getValue <= max) {
            return getValue;
        }
        System.out.println(getValue + " is out of range. Try again:");
            return getDouble(min, max);
    }

}