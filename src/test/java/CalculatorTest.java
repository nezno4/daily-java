import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

class CalculatorTest {

    private static final Logger LOGGER = Logger.getLogger(CalculatorTest.class.getName());

    @Test
    void testAdd() {
        LOGGER.info("Starting addition test");
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-1, calculator.add(-1, 0));
        assertEquals(-3, calculator.add(-1, -2));
    }

    @Test
    void testSubtract() {
        LOGGER.info("Starting subtraction test");
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.subtract(2, 3));
        assertEquals(3, calculator.subtract(3, 0));
        assertEquals(-2, calculator.subtract(-1, 1));
        assertEquals(1, calculator.subtract(-1, -2));
    }

    @Test
    void testMultiply() {
        LOGGER.info("Starting multiplication test");
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(-6, calculator.multiply(-2, 3));
    }

    @Test
    void testDivide() {
        LOGGER.info("Starting division test");
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(6, 3));
        assertEquals(0.0, calculator.divide(0, 5));
        assertEquals(-2.0, calculator.divide(-6, 3));

        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));

        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

