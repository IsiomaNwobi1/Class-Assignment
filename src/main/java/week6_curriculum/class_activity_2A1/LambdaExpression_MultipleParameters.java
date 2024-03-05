package week6_curriculum.class_activity_2A1;

public class LambdaExpression_MultipleParameters {

    public static void main(String[] args) {

        YourName s = (num, nums) -> {
            return num + nums;

        };
        System.out.println(s.say(60,01));
    }
}

