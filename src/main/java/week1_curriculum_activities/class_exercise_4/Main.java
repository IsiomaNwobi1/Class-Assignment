package week1_curriculum_activities.class_exercise_4;

public class Main {
    public static void main(String[] args) {
        Teacher obj1 = new Teacher("Isi", 25);
        Student obj2 = new Student("Stella", 17);


        System.out.println("Teacher's details: ");
        obj1.display();
        System.out.println("----------------");
        System.out.println("Student's details: ");
        obj2.display();
    }
}
