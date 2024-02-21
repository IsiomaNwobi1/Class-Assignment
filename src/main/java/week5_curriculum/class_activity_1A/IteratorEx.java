package week5_curriculum.class_activity_1A;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Benin");
        cities.add("Uyo");
        cities.add("Awka");
        cities.add("Asaba");
        cities.remove("Kaduna");

        Iterator<String> iterator = cities.iterator();

        while (iterator.hasNext()) {
            String cityNames = iterator.next();
                System.out.println(cityNames);
        }
    }
}

