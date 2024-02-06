package week1_curriculum_activities.test1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void add() {
        SimpleCalculator call = new SimpleCalculator();
        int actual = call.add(2,2);
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        SimpleCalculator pick = new SimpleCalculator();
        int actual = pick.multiply(2,5);
        int expected = 10;

        assertEquals(expected, actual);
    }
}