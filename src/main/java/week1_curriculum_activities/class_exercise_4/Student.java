package week1_curriculum_activities.class_exercise_4;

public class Student extends Person{

    public Student(String name, int age) {
        super(name, age);
    }

    public void display() {
        System.out.println(getName() + " " + getAge());

    }
}
