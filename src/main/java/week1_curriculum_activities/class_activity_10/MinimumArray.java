package week1_curriculum_activities.class_activity_10;

import java.util.Arrays;

public class MinimumArray {

    public static int min(int[] arr) {

        //this line assumes that the array is not empty
        int min = arr[0];

        //this line checks if the current element (arr[i]) being iterated over in the array is less
        //than the current minimum value if the value is smaller, updates the value of min to be the
        //value of the current element.

        for (int i = 0; i < arr.length; i++)
            if (arr[i] < min) {
                min = arr[i];

        }

        return min;
    }

    public static void main(String[] args) {
        int[] a = {33, 6, 10, 2};

        System.out.println(min(a));
    }
}

