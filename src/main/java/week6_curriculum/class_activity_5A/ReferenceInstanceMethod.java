package week6_curriculum.class_activity_5A;

public class ReferenceInstanceMethod {

    public void saySomething(){
        System.out.println("Hello, this is an instance method.");
    }
    public static void main(String[] args) {

        ReferenceInstanceMethod referenceInstanceMethod = new ReferenceInstanceMethod();

        SayAble sayAble = referenceInstanceMethod::saySomething;
        sayAble.say();

    }
}
