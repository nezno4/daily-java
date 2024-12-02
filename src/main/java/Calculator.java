
/**
 * The Calculator class is used to perform basic mathematical operations.
 * This class provides methods for adding, subtracting, multiplying, and dividing two integers.
 * The divide method throws an IllegalArgumentException if an attempt is made to divide by zero,
 * ensuring safe operation. However, this class is not fully thread-safe as it does not include
 * synchronization mechanisms. Caution should be exercised when using its instances in a multi-threaded environment.
 */

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}
