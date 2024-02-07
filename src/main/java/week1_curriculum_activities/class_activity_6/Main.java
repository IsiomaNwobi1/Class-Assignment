package week1_curriculum_activities.class_activity_6;

public class Main {

    public static void main(String[] args) {
        Developers d1 = new Developers(1, "Isioma");
        Developers d2 = new Developers(2, "Stella");
        Developers d3 = new Developers(3, "Nwobi");
        Developers d4 = new Developers(4, "Ciel");
        Developers d5 = new Developers(5, "Belle");

        Developers.institute = "Decagon";

        d1.display();
        d2.display();
        d3.display();
        d4.display();
        d5.display();
    }
}
