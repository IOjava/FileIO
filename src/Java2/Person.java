package Java2;

public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }
    public void sayHello(){
        System.out.println("hello " + this.name);
    }

    public Person(String name) {
        this.name = name;
    }
}
