package Java2;

public class CircleApp{
    public static void main(String[] args) {
        Input value = new Input();
        Circle entry = new Circle(value.getDouble());
        double area = entry.getArea();
        double circum = entry.getCircumference();
        System.out.printf("Area is: %.3f \n", area);
        System.out.printf("Circumference is: %.3f \n", circum);


    }
}