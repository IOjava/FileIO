package Abstract_Interfaces;

public class Square extends Quadralateral {
        private double side;

        public Square(double side) {super(side, side);this.side = side;}

        @Override
        public double getPerimeter() {return 4*this.side;}

        @Override
        public double getArea() {return this.side * this.side;}

        @Override
        public void setLength(double length) {this.length = length;}

        @Override
        public void setWidth(double width) {this.width = width;}

    }

