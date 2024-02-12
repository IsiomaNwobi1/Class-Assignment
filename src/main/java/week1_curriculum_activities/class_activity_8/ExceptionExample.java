package week1_curriculum_activities.class_activity_8;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int num = 500 / 0;
        } catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Run other code");
        }
    }

