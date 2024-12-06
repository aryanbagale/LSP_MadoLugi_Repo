package org.howard.edu.lsp.finalexam.question2;

/**
 * Implementation of RandomNumberStrategy using a Linear Congruential Generator (LCG).
 * An LCG is a simple algorithm for generating a sequence of pseudo-random numbers.
 */
public class RandomNumberAlgorithm implements RandomNumber {
    
    // Initial seed value (X0) for the LCG
    private int Xo = 5; 
    
    // Modulus (m), determines the range of the random numbers
    private int m = 7;  
    
    // Multiplier (a), part of the LCG formula
    private int a = 3;  
    
    // Increment (c), part of the LCG formula
    private int c = 3;  
    
    // Tracks the current value in the sequence
    private int current;

    /**
     * Constructor initializes the LCG with the seed value.
     */
    public RandomNumberAlgorithm() {
        this.current = Xo;
    }

    /**
     * Generates the next number in the pseudo-random sequence using the LCG formula.
     * Formula: Xn+1 = (Xn * a + c) % m
     * 
     * @return the next number in the sequence
     */
    @Override
    public int generateRandomNumber() {
        // Update the current value using the LCG formula
        current = (current * a + c) % m;
        return current; // Return the generated number
    }
}
