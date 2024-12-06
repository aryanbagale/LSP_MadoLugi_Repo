package org.howard.edu.lsp.finalexam.question2;

/**
 * Interface for random number generation strategies.
 * Defines a contract that all random number generation classes must implement.
 * This enables flexibility in using different algorithms or methods for generating random numbers.
 */
public interface RandomNumber {

    /**
     * Generates a random positive integer.
     * Implementing classes must provide the logic to generate a random number.
     * 
     * @return a random positive integer
     */
    int generateRandomNumber();
}
