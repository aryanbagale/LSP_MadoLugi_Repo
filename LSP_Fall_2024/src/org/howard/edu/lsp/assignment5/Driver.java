package org.howard.edu.lsp.assignment5;

public class Driver {
    public static void main(String[] args) throws Exception {
        
        // Initialize two IntegerSet instances
        IntegerSet setA = new IntegerSet();
        IntegerSet setB = new IntegerSet();

        // Add elements to setA
        setA.add(1);
        setA.add(2);
        setA.add(3);

        // Add elements to setB
        setB.add(3);
        setB.add(4);
        setB.add(5);

        // Display initial values of the sets
        System.out.println("Initial value of Set A: " + setA.toString());
        System.out.println("Initial value of Set B: " + setB.toString());
        System.out.println();  // Line break for readability

        // Test smallest and largest methods
        System.out.println("Testing smallest and largest methods:");
        System.out.println("Smallest value in Set A: " + setA.smallest());  
        System.out.println("Largest value in Set A: " + setA.largest());    
        System.out.println();  // Line break for readability

        // Test contains method
        System.out.println("Testing contains method:");
        System.out.println("Set A contains 2: " + setA.contains(2));  
        System.out.println("Set A contains 5: " + setA.contains(5));  
        System.out.println();  // Line break for readability

        // Test equals method
        System.out.println("Testing equals method:");
        System.out.println("Current value of Set A: " + setA.toString());
        System.out.println("Current value of Set B: " + setB.toString());
        System.out.println("Set A equals Set B: " + setA.equals(setB));  

        // Add more elements to setB and test equality again
        setB.add(1);
        setB.add(2);
        System.out.println("Value of Set B after adding 1 and 2: " + setB.toString());
        System.out.println("Set A equals Set B after adding elements to Set B: " + setA.equals(setB));  
        System.out.println();  // Line break for readability

        // Test union method
        System.out.println("Testing union method:");
        System.out.println("Current value of Set A: " + setA.toString());
        System.out.println("Current value of Set B: " + setB.toString());
        setA.union(setB);
        System.out.println("Union of Set A and Set B: " + setA.toString());  
        System.out.println();  // Line break for readability

        // Test intersect method
        System.out.println("Testing intersect method:");
        setA = new IntegerSet();  // Reset setA
        setA.add(1);
        setA.add(2);
        setA.add(3);
        System.out.println("Current value of Set A: " + setA.toString());
        System.out.println("Current value of Set B: " + setB.toString());
        setA.intersect(setB);
        System.out.println("Intersection of Set A and Set B: " + setA.toString());  
        System.out.println();  // Line break for readability

        // Test difference method
        System.out.println("Testing difference method:");
        setA = new IntegerSet();  // Reset setA
        setA.add(1);
        setA.add(2);
        setA.add(3);
        System.out.println("Current value of Set A: " + setA.toString());
        System.out.println("Current value of Set B: " + setB.toString());
        setA.diff(setB);
        System.out.println("Difference of Set A and Set B: " + setA.toString()); 
        System.out.println();  // Line break for readability

        // Test complement method
        System.out.println("Testing complement method:");
        setA = new IntegerSet();  // Reset setA
        setA.add(1);
        setA.add(2);
        setA.add(3);
        System.out.println("Current value of Set A: " + setA.toString());
        System.out.println("Current value of Set B: " + setB.toString());
        setA.complement(setB);
        System.out.println("Complement of Set A and Set B: " + setA.toString());  
        System.out.println();  // Line break for readability

        // Test isEmpty method
        System.out.println("Testing isEmpty method:");
        System.out.println("Current value of Set A: " + setA.toString());
        System.out.println("Set A is empty: " + setA.isEmpty());  
        
        // Clear setA and test if it's empty
        setA.clear();
        System.out.println("Value of Set A after clear: " + setA.toString());
        System.out.println("Set A is empty after clear: " + setA.isEmpty()); 
        System.out.println();  // Line break for readability

        // Test clear method
        System.out.println("Testing clear method:");
        setA.add(1);
        setA.add(2);
        setA.add(3);
        System.out.println("Value of Set A before clear: " + setA.toString());
        setA.clear();
        System.out.println("Value of Set A after clear: " + setA.toString());  
    }
}
