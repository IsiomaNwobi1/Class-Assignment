package week7_curriculum.class_activity_7A;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            Runnable task = new MultipleThreadsTask("Task " + (i + 1));
            service.submit(task);
        }
        service.shutdown();
    }
}
