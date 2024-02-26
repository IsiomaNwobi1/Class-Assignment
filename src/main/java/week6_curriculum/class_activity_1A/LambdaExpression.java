package week6_curriculum.class_activity_1A;

public class LambdaExpression {
    public static void main(String[] args) {

        int width = 30;

        //Without Lamdba Expression - Implementing Drawable using anonymous class.
        Drawable d1 = new Drawable() {
            @Override
            public void draw() {

                System.out.println("Drawing without Lambda: " + width);
            }
        }; //semicolon is also called End-of-Line
        d1.draw();



        //With Lambda Expression
        Drawable d2 = ()-> {
                System.out.println("Drawing with Lambda: " + width);
        };
        d2.draw();
    }
}




