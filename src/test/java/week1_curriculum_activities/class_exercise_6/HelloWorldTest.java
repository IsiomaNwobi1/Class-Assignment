package week1_curriculum_activities.class_exercise_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void name() {
        HelloWorld call = new HelloWorld();
        String actual = call.name();
        String expected = "Hello World";
        assertEquals(expected, actual);
    }
}