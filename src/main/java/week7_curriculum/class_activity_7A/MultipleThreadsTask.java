package week7_curriculum.class_activity_7A;

public class MultipleThreadsTask implements Runnable {
    private String name;

    public MultipleThreadsTask(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        System.out.println("Executing " + name + " on thread " + Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed " + name);
    }
}
