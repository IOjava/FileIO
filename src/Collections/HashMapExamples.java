package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);

        System.out.println(map.get("one"));
        System.out.println(map.size());

        map.forEach((k,v)->{
            System.out.println("key: "+ k +"\nvalue: " + v);
        });


    }
}
