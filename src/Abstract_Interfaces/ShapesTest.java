package Abstract_Interfaces;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(1,1);

        System.out.println("Area for box1 is: " + myShape.getArea());
        System.out.println("Perimeter for box1 is: " + myShape.getPerimeter());

        myShape = new Square(2);

        System.out.println("Area for box2 is: " + myShape.getArea());
        System.out.println("Perimeter for box2 is: " + myShape.getPerimeter());
    }
}
