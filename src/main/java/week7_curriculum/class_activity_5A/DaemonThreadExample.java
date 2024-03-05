package week7_curriculum.class_activity_5A;

public class DaemonThreadExample extends Thread {

    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread is present");
        } else {
            System.out.println("User thread is present");
        }
    }

    public static void main(String[] args) {
        DaemonThreadExample t1 = new DaemonThreadExample();
        DaemonThreadExample t2 = new DaemonThreadExample();
        DaemonThreadExample t3 = new DaemonThreadExample();

        t1.setDaemon(true);
        t2.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
    }
}
