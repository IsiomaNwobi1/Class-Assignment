package week6_curriculum.class_exercise_0A;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<StudentLambda> students = new ArrayList<>();

        StudentLambda student1 = new StudentLambda("Sarah", 17);
        StudentLambda student2 = new StudentLambda("Aden", 19);
        StudentLambda student3 = new StudentLambda("Onyi", 16);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        students.sort(Comparator.comparing(StudentLambda::getName));

        students.forEach(
                (n) -> System.out.println(n)
        );
    }
}
