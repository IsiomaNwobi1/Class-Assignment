package week6_curriculum.class_activity_3A1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpression_Comparator {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Strawberry");
        fruits.add("Kiwi");

        fruits.sort(Comparator.comparing(String::length));

        fruits.forEach(
                (n) -> System.out.println(n)
        );
        }
    }


