package Java2;

public class CircleApp{

    public static void main(String[] args) {

        Input value = new Input();
        System.out.println("Enter radius:");
        double radius = value.getDouble();
        Circle c = new Circle(radius);
        System.out.printf("Area is: %.3f \n", c.getArea());
        System.out.printf("Circumference is: %.3f \n",c.getCircumference());

    }
}