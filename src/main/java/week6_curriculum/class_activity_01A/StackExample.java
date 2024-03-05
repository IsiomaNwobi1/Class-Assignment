package week6_curriculum.class_activity_01A;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //Let's check if the stack is empty or not.
        boolean isEmptyOrNot = stack.isEmpty();

        System.out.println("Is the stack empty? : " +isEmptyOrNot);

        //Pushing elements into the stack
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);

//        stack.pop();
//        stack.pop();

        int peek = stack.peek();

        //The output would print out as an array
        System.out.println("Elements peeking into stack: " + peek);
    }
}
