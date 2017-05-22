package Collections;

import Abstract_Interfaces.Measurable;
import Abstract_Interfaces.Rectangle;
import Abstract_Interfaces.Square;
import java.util.ArrayList;
import java.util.List;


public class ListExample {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Fer");
        list.add(1);
        list.add(new Rectangle(2.4, 4.3));
        list.add(new Square(5.5));

        Square x = (Square)(list.get(3));
        System.out.println(x.getArea());

        System.out.println(list.isEmpty());
        System.out.println(list.size());


        for(int i = 0; i < list.size(); i++){
            System.out.println(i);
        }

        for(Object element : list){
            System.out.println(element);
        }
        // Generics
        List<String> strings = new ArrayList<>();
        strings.add("Jason");

        for(String string:strings){
            System.out.println(string);
        }
        List<Measurable> polygons = new ArrayList<>();

        polygons.add(new Square(4.5));
        polygons.add(new Rectangle(5.2, 4.8));

        for(Measurable measurable : polygons){
            System.out.println(measurable);
        }


        //Boxing -> Wrapper classes for primitive types
        //primitive types are not objects. They are values.
        //When using generics use the wrapper class in ArrayList Generics

        List<Integer> integers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        List<Float> floats = new ArrayList<>();
        List<Boolean> booleans = new ArrayList<>();


    }
}
