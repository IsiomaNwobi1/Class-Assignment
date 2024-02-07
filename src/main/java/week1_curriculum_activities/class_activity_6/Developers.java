package week1_curriculum_activities.class_activity_6;

public class Developers {
    int id;
    String name;
    static String institute = "Decagon";

    public Developers(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static String getInstitute() {
        return institute;
    }

    void display(){
        System.out.println(getId() + " " + getName() + " " + getInstitute());
    }
}
