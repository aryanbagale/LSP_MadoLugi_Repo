package org.howard.edu.lsp.midterm.question2;

public class Calculator {
    // Method to calculate the sum of two integers
    public static int calculateSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // Method to calculate the sum of two double values
    public static double calculateSum(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }

    // Method to calculate the sum of all elements in an integer array
    public static int calculateSum(int[] numbers) {
        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }
        return totalSum;
    }
}
