package Collections;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    // Empty List of Grades
    private List<Integer> grades;

    // Constructor
    public Student(String name){this.name = name; this.grades = new ArrayList<>();}


    public String getName() {return name;}

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);

    }
    //variadic
    public void addGrades(int ...grades) {
        for (int grade : grades) {
            this.grades.add(grade);
        }
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for(Integer grade: grades){
             sum += Double.valueOf(grade);
        }
        return sum/this.grades.size();
    }

    public static void main(String[] args) {
//        List <Integer> grades = new ArrayList<>();
//        Student student = new Student("Jason");
//
//        student.addGrade(grades);
//        student.addGrade(10);
//        student.addGrade(9);
//
//
//
//        System.out.println(student.getGradeAverage());
    }

}
