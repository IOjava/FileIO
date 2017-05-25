package Exceptions;

public class InputTest {
    public static void main(String[] args) {

        Input entry = new Input();

        System.out.println("Enter a #: ");
        System.out.println(entry.getInt());

        System.out.println("Enter a # Between 10 and 40");
        System.out.println(entry.getInt(10,40));

        System.out.println("Enter a Decimal #");
        System.out.println(entry.getDouble());

        System.out.println("Enter a  Decimal # Between 10.0 and 40.0");
        System.out.println(entry.getDouble(10.0, 40.0));

    }
}
