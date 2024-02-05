package week1_curriculum_activities.class_activity_1.class_exercise_1;

public class Parent {
    private String color;

    public Parent(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void display(){
        System.out.println("Colour: " + getColor());
    }
}
