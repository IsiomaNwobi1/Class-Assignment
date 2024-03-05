package week7_curriculum.class_activity_1;

public class ThreadStateDemo implements Runnable {

    public static Thread t1;

    public static ThreadStateDemo obj;

    public static void main(String[] args) {

        // Creating an object of the class ThreadStateDemo
        obj = new ThreadStateDemo();
        t1 = new Thread(obj);

        // The thread t1 is currently in the NEW State
        System.out.println("The state of thread t1 after spawning it - " + t1.getState());

        // Invoking the start method on thread t1
        t1.start();

        System.out.println("The state of thread t1 after invoking the method start() on it - " + t1.getState());
    }

    @Override
    public void run() {
        ThreadStateExample tsExample = new ThreadStateExample();
        Thread t2 = new Thread(tsExample);

        // Thread t2 is created and is currently in the new state
        System.out.println("The state of t2 after spawning it - " + t2.getState());

        // Invoking the start method on thread t2
        t2.start();

        // Thread t2 is moved to the runnable state
        System.out.println("The state of thread t2 after calling the method on it - " + t2.getState());

//        try {
//            // Moving the thread t1 to the timed waiting state
//            Thread.sleep(200);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("The state of thread t2 after invoking the sleep method on it - " + t2.getState());

        try {
            // Waiting for thread t2 to complete its execution
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The state of thread t2 when it has compiled it's execution - " + t2.getState());
    }
}
