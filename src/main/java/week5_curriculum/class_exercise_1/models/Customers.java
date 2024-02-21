package week5_curriculum.class_exercise_1.models;

public class Customers {
    private String name;
    private int age;

    public Customers(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
