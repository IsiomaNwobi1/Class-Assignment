package week1_curriculum_activities.class_exercise_5;

public class Teacher implements Teachable{
    @Override
    public void teachCourse(String course) {
        System.out.println("Teaching " + course);
    }
}
