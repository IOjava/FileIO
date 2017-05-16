package Java2;

public class BestBuy {
    public static void main(String[] args) {
        Computer mac = new Computer();
        Computer windows = new Computer();


        mac.CPU = "1.21Ghz";
        System.out.println(mac.CPU);

        mac.powerOn();

        System.out.println(windows.CPU);

        System.out.println(Computer.category);

        mac.getTotalPrice(true);
    }
}
