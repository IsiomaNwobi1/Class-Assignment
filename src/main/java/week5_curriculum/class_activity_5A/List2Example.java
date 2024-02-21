package week5_curriculum.class_activity_5A;

import java.util.LinkedList;
import java.util.List;

public class List2Example {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("Mango");
        list.add("Cherry");
        list.add("Apple");
        list.add("Pineapple");
        list.add("Kiwi");

        for(String lt : list) {
            System.out.println(lt);
        }
    }
}
