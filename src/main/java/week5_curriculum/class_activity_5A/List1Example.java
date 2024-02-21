package week5_curriculum.class_activity_5A;

import java.util.ArrayList;
import java.util.List;

public class List1Example {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Mango");
        list.add("WaterMelon");
        list.add("Orange");
        list.add("Sugarcane");
        list.add("Cherry");

        for (String lt : list) {
            System.out.println(lt);
            //System.out.println(list.get(0)); //to print out only mango
            //System.out.println(list.isEmpty()); //to check if the list is empty
            //System.out.println(list.indexOf("Mango")); //to check the index of Mango
            //System.out.println(list.size()); //to check the size or length of the list

        }
    }
}
