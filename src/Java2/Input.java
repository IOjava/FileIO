package Java2;

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

    public int getInt(){
        return in.nextInt();
    }

    public int getInt(int min, int max){
        int getValue = this.getInt();

        if(getValue >= min && getValue <= max){
            return getValue;
        }
        System.out.println(getValue + " is out of range. Try again:");
        return getInt(min,max);
    }

    public double getDouble(){
        return in.nextDouble();
    }

    public double getDouble(double min, double max){
        double getValue = this.getDouble();
        if(getValue >= min && getValue <= max){
            return getValue;
        }
        System.out.println(getValue+" is out of range. Try again:");
        return getDouble(min,max);
    }


}
