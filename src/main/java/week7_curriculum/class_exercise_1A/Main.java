package week7_curriculum.class_exercise_1A;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CountDownTimer cd = new CountDownTimer(10);
        cd.start();

        try {
            cd.join();
            System.out.println("Countdown Complete");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
