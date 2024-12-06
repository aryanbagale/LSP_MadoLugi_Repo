package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// Test class for MathUtils to validate its methods using unit tests
public class MathUtilsTest {

    // Instance of MathUtils to access the methods being tested
    MathUtils mathUtils = new MathUtils();

    // Test cases for the factorial method
    @Test
    public void testFactorialPositiveNumbers() {
        // Verify factorial of positive numbers
        assertEquals(120, mathUtils.factorial(5), "Factorial of 5 should be 120");
        // Verify factorial of 0 (edge case)
        assertEquals(1, mathUtils.factorial(0), "Factorial of 0 should be 1");
    }

    @Test
    public void testFactorialEdgeCase() {
        // Verify factorial of 1, a boundary case
        assertEquals(1, mathUtils.factorial(1), "Factorial of 1 should be 1");
    }

    @Test
    public void testFactorialNegativeNumber() {
        // Verify that factorial throws an exception for negative input
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.factorial(-1);
        });
        // Verify the exception message for invalid input
        assertEquals("Number must be non-negative", exception.getMessage());
    }

    // Test cases for the isPrime method
    @Test
    public void testIsPrimeTrue() {
        // Verify that prime numbers return true
        assertTrue(mathUtils.isPrime(7), "7 should be a prime number");
        assertTrue(mathUtils.isPrime(13), "13 should be a prime number");
    }

    @Test
    public void testIsPrimeFalse() {
        // Verify that non-prime numbers return false
        assertFalse(mathUtils.isPrime(4), "4 is not a prime number");
        // Verify that 1 is not considered prime
        assertFalse(mathUtils.isPrime(1), "1 is not a prime number");
    }

    @Test
    public void testIsPrimeEdgeCases() {
        // Verify that 0 and negative numbers are not prime
        assertFalse(mathUtils.isPrime(0), "0 is not a prime number");
        assertFalse(mathUtils.isPrime(-5), "Negative numbers are not prime");
    }

    // Test cases for the gcd (Greatest Common Divisor) method
    @Test
    public void testGcdPositiveNumbers() {
        // Verify GCD for positive numbers
        assertEquals(6, mathUtils.gcd(54, 24), "GCD of 54 and 24 should be 6");
        assertEquals(1, mathUtils.gcd(17, 13), "GCD of 17 and 13 should be 1");
    }

    @Test
    public void testGcdWithZero() {
        // Verify GCD when one number is zero
        assertEquals(5, mathUtils.gcd(5, 0), "GCD of 5 and 0 should be 5");
        assertEquals(7, mathUtils.gcd(0, 7), "GCD of 0 and 7 should be 7");
    }

    @Test
    public void testGcdBothZero() {
        // Verify that GCD throws an exception when both numbers are zero
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.gcd(0, 0);
        });
        // Verify the exception message for invalid input
        assertEquals("Both numbers cannot be zero", exception.getMessage());
    }
}
