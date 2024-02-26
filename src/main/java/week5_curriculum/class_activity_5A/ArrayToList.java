package week5_curriculum.class_activity_5A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] stack = {"Node", "DotNet", "Java"};

        System.out.println("Arrays = " + Arrays.toString(stack));

        System.out.println("********************");

        List<String> list = new ArrayList<>();

        for (String lt : stack) {
            list.add(lt);
        }
            System.out.println("List : " + list);
        }
    }


