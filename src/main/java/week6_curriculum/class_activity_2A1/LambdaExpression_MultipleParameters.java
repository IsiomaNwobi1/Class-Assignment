package week6_curriculum.class_activity_2A1;

public class LambdaExpression_MultipleParameters {

    public static void main(String[] args) {

        YourName say = (num, nums) -> {
            return num + nums;

        };
        System.out.println(say.say(60,01));
    }
}

