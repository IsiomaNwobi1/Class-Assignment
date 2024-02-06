package week1_curriculum_activities.class_exercise_4;

public class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void display() {
        System.out.println(getName() + " " + getAge());

    }
}
