package week5_curriculum.class_exercise_1.models;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customers> {

    @Override
    public int compare(Customers c1, Customers c2) {
        if (c1.getAge() > c2.getAge()){
            return -1;
        } else if (c1.getAge() < c2.getAge()) {
            return 1;
        }
        return 0;
    }
}
