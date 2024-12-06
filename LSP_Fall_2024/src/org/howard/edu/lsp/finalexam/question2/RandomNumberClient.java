package org.howard.edu.lsp.finalexam.question2;

/**
 * Client program to test RandomNumberService with different strategies.
 * Demonstrates the use of the Singleton and Strategy design patterns.
 */
public class RandomNumberClient {

    public static void main(String[] args) {
        // Obtain the singleton instance of RandomNumberService
        RandomNumberService service = RandomNumberService.getInstance();

        // Set the strategy to RandomNumberJava and generate a random number
        service.setStrategy(new RandomNumberJava());
        System.out.println("Java Random Number: " + service.generateRandomNumber());

        // Set the strategy to RandomNumberAlgorithm and generate a random number
        service.setStrategy(new RandomNumberAlgorithm());
        System.out.println("LCG Random Number: " + service.generateRandomNumber());
    }
}
