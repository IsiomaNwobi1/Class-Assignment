package week6_curriculum.class_activitya_2A;

public class LambdaExpression_SingleParameter {

    public static void main(String[] args) {
        SayMyName s = (name) -> {
            return "Hello, " + name;
        };
        System.out.println(s.say("Isioma"));
    }
}
