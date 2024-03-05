package week6_curriculum.class_activity_4A;

public class ReferenceStaticMethod {

    public static void saySomething(){
        System.out.println("Hello, this is a static method.");
    }

    public static void main(String[] args) {

        SayAble sayAble = ReferenceStaticMethod::saySomething;
        sayAble.say();

    }
}
