package Java2;

public class InputTest {
    public static void main(String[] args) {
        Input entry = new Input();
        String text = entry.getString();
        boolean ask = entry.yesNo();
        int num1 = entry.getInt();
        int num2 = entry.getInt(1, 40);
        double dbl1 = entry.getDouble();
        double dbl2 = entry.getDouble(0.22, 89.34);



        System.out.println(text);
        System.out.println(ask);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(dbl1);
        System.out.println(dbl2);
    }
}
