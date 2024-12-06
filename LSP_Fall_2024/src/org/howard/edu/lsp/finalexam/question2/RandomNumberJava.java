package org.howard.edu.lsp.finalexam.question2;

// Import the Random class from Java's built-in utilities
import java.util.Random;

/**
 * Implementation of the RandomNumber interface using Java's built-in Random class.
 * This class provides a method to generate random numbers.
 */
public class RandomNumberJava implements RandomNumber {

    // Create an instance of the Random class to generate random numbers
    private Random random = new Random();

    /**
     * Generates a random integer between 1 and Integer.MAX_VALUE.
     * 
     * @return A randomly generated integer value.
     */
    @Override
    public int generateRandomNumber() {
        // Generates a random number in the range [0, Integer.MAX_VALUE) and adds 1 to shift the range to [1, Integer.MAX_VALUE]
        return random.nextInt(Integer.MAX_VALUE) + 1;
    }
}
