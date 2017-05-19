package Abstract_Interfaces;

public class Rectangle extends Quadralateral implements Measurable{

    public Rectangle(double length, double width){super(length, width);}

    @Override
    public double getPerimeter(){return this.getLength()*2 + this.getWidth()*2;}

    @Override
    public double getArea(){return this.length * this.width;}

    @Override
    public void setLength(double length){this.length=length;}

    @Override
    public void setWidth(double width){this.width=width;}

}

