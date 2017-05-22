package Abstract_Interfaces;

public class Square extends Quadralateral implements Measurable{

        public Square(double side) {super(side, side);}

        @Override
        public double getArea() {return length * width;}

        @Override
        public double getPerimeter() {return length*2 + width*2;}


        @Override
        public void setLength(double length) {this.length = length;}

        @Override
        public void setWidth(double width) {this.width = width;}

    }

