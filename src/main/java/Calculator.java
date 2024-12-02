
/**
 * The Calculator class is used to perform basic mathematical operations.
 * This class provides methods for adding, subtracting, multiplying, and dividing two integers.
 * The divide method throws an IllegalArgumentException if an attempt is made to divide by zero,
 * ensuring safe operation. However, this class is not fully thread-safe as it does not include
 * synchronization mechanisms. Caution should be exercised when using its instances in a multi-threaded environment.
 */

public class Calculator {

    /**
     * Adds two integers.
     *
     * @param a the first integer to add
     * @param b the second integer to add
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts one integer from another.
     *
     * @param a the integer from which to subtract
     * @param b the integer to subtract
     * @return the result of a minus b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a the first integer to multiply
     * @param b the second integer to multiply
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides one integer by another.
     *
     * @param a the numerator (the integer to be divided)
     * @param b the denominator (the integer by which to divide)
     * @return the result of dividing a by b
     * @throws IllegalArgumentException if b is zero
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}
