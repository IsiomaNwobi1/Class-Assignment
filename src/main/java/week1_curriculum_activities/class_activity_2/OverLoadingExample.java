package week1_curriculum_activities.class_activity_2;

public class OverLoadingExample {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int c, int d, int e, int f) {
        return c + d + e + f;
    }
}
