package Java2;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width){this.length=length;this.width=width;}

//    Setters
    public void setLength(int length) {this.length = length;}
    public void setWidth(int width) {this.width = width;}

//    Getters
    public int getPerimeter() {return length * 2;}
    public int getArea() {return length * width;}
}