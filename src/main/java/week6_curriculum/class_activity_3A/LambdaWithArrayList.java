package week6_curriculum.class_activity_3A;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithArrayList {

    public static void main(String[] args) {

        List<String> numbers = new ArrayList<>();

        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add("five");

        numbers.forEach(
                (n) -> System.out.println(n)
        );
    }
}
