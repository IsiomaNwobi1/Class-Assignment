package week5_curriculum.class_activity_2B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Isioma", 27);
        Person person2 = new Person("Jane", 20);
        Person person3 = new Person("Ciel", 19);
        Person person4 = new Person("Rose", 25);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        Collections.sort(people, new AgeComparator());

        //loop through the objects
        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
