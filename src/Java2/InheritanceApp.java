package Java2;

public class InheritanceApp {
    public static void main(String[] args) {
        Person jason = new Person("Jason", 32, 'M');
        Student student = new Student("Jason", 32, 'M', "Pinnacles", "PHP");
        System.out.println(jason.description());
        System.out.println(student.description());


    }
}
