package week7_curriculum.class_exercise_1A;

public class CountDownTimer extends Thread{

    public int start;

    public CountDownTimer(int start) {
        this.start = start;
    }

    @Override
    public void run() {

        for (int i = start; i >=  0; i--){
            System.out.println("Count Down: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
