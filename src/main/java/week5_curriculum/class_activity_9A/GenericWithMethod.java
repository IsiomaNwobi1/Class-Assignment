package week5_curriculum.class_activity_9A;

public class GenericWithMethod {
    public static <E> void printArray(E[] elements) {
        for (E e : elements) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Integer[] intArr = {50, 40, 30, 20, 10};
        Character[] charArr = {'A', 'B', 'C', 'D', 'E'};
        String[] stringArr = {"Ciel", "Stella", "Belle"};

        System.out.println("Print integer array : ");
        printArray(intArr);

        System.out.println("Print character array : ");
        printArray(charArr);

        System.out.println("Print string array : ");
        printArray(stringArr);
    }
}
