package week6_curriculum.class_exercise_0A;

public class StudentLambda {

    private String name;
    private int age;

    public StudentLambda(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "StudentLambda{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
