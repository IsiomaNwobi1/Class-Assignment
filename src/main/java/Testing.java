import java.util.Random;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter your fullname: ");
        String fullname = scanner.nextLine();

        System.out.println("Hello " + fullname + "," + "You're welcome!");


        int score = 0;
        int numberofquestions = 5;

        for (int i = 0; i <=4; i++) {
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;
            int math = random.nextInt(5);
            String operator = null;
            int result = 1;
            switch (math) {
                case 1:
                    result = num1 + num2;
                    operator = "+";
                    break;
                case 2:
                    result = num1 - num2;
                    operator = "-";
                    break;
                case 3:
                    result = num1 * num2;
                    operator = "*";
                    break;
                case 4:
                    result = num1 / num2;
                    operator = "/";
                    break;

            }
            System.out.println("What is " + num1 + operator + num2 + "? ");

            int userAnswer = scanner.nextInt();
            if (userAnswer == result) {
                score++;
            }


        }
        System.out.println("Your final score is:" + score + "out of" + numberofquestions);
    }
}


