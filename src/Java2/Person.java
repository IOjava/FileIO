package Java2;

public class Person {
    protected String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String description() {
        return String.format(
                "This is %s and %s is %d years old",
                name,
                'F' == gender ? "she" : "he",
                age
        );
    }
}

