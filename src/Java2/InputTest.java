package Java2;

public class InputTest {
    public static void main(String[] args) {

        Input entry = new Input();
        int min = 1;
        int max = 40;
        System.out.println("Is today Wed?");
        System.out.println(entry.yesNo());
        System.out.println("Provide a # between "+min+" and "+max);
        System.out.println(entry.getInt(min, max)+" is in range!");

    }
}
