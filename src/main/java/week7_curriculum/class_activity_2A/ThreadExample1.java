package week7_curriculum.class_activity_2A;

public class ThreadExample1 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is currently running");
    }

    public static void main(String[] args) {
        ThreadExample1 threadEx1 = new ThreadExample1();

        threadEx1.start();
    }
}

