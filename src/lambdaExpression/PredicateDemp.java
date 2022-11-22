package lambdaExpression;

import models.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemp {
    public static void main(String[] args) {
        List<Student> students=Arrays.asList(new Student("Karl",23,"CS"),
                new Student("MacLarane",32,"IT"),
                new Student("Sonu Kumar",30,"Java"));

        Predicate<Student> pre= student -> student.getName().contains("S");
        for (Student student: students){
            if (pre.test(student)){
                System.out.println(student.getName());
            }
        }

    }
}
