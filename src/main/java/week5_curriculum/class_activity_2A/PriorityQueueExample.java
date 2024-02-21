package week5_curriculum.class_activity_2A;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        queue.add("five");

        Iterator<String> iterator = queue.iterator();

        while (iterator.hasNext()) {
            String numbers = iterator.next();
            System.out.println(numbers);
        }
    }
}
