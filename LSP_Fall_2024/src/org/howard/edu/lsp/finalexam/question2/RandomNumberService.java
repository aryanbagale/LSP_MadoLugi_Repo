package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton service for generating random numbers using different strategies.
 * This ensures there is only one instance of RandomNumberService, 
 * which can be used globally to generate random numbers.
 */
public class RandomNumberService {

    // Static instance of the singleton class
    private static RandomNumberService instance;

    // Holds the strategy for random number generation
    private RandomNumber strategy;

    // Private constructor to restrict instantiation from outside
    private RandomNumberService() {}

    /**
     * Provides access to the singleton instance of RandomNumberService.
     * Creates a new instance if it doesn't exist; otherwise, returns the existing instance.
     * 
     * @return the singleton instance of RandomNumberService
     */
    public static RandomNumberService getInstance() {
        // Lazy initialization: instance is created only when accessed for the first time
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the strategy for random number generation.
     * This allows dynamic switching of strategies at runtime.
     * 
     * @param strategy the RandomNumber strategy to use
     */
    public void setStrategy(RandomNumber strategy) {
        this.strategy = strategy;
    }

    /**
     * Generates a random number using the currently set strategy.
     * If no strategy is set, it throws an exception.
     * 
     * @return a random positive integer
     * @throws IllegalStateException if the strategy is not set
     */
    public int generateRandomNumber() {
        // Ensure a strategy is set before attempting to generate a random number
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set");
        }
        // Delegate random number generation to the current strategy
        return strategy.generateRandomNumber();
    }
}
