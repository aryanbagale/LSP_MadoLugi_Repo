package org.howard.edu.lsp.assignment5;

public class Driver {
    public static void main(String[] args) throws Exception {
        
        IntegerSet numberSetA = new IntegerSet();
        IntegerSet numberSetB = new IntegerSet();

        numberSetA.add(1);
        numberSetA.add(2);
        numberSetA.add(3);

        numberSetB.add(3);
        numberSetB.add(4);
        numberSetB.add(5);

        System.out.println("Initial elements in numberSetA: " + numberSetA.toString());
        System.out.println("Initial elements in numberSetB: " + numberSetB.toString());
        System.out.println();  

        // Testing retrieval of smallest and largest values
        System.out.println("Testing retrieval of smallest and largest values:");
        System.out.println("Smallest value in numberSetA: " + numberSetA.smallest());  
        System.out.println("Largest value in numberSetA: " + numberSetA.largest());    
        System.out.println();  // Line break for readability

        // Testing the contains method
        System.out.println("Testing contains method:");
        System.out.println("numberSetA contains 2: " + numberSetA.contains(2));  
        System.out.println("numberSetA contains 5: " + numberSetA.contains(5));  
        System.out.println();  

        // Testing the equals method
        System.out.println("Testing equals method:");
        System.out.println("Current state of numberSetA: " + numberSetA.toString());
        System.out.println("Current state of numberSetB: " + numberSetB.toString());
        System.out.println("numberSetA equals numberSetB: " + numberSetA.equals(numberSetB));  
        numberSetB.add(1);
        numberSetB.add(2);
        System.out.println("Updated numberSetB after adding 1 and 2: " + numberSetB.toString());
        System.out.println("numberSetA equals numberSetB after additions: " + numberSetA.equals(numberSetB));  
        System.out.println();  

        // Testing the union method
        System.out.println("Testing union method:");
        System.out.println("Elements in numberSetA: " + numberSetA.toString());
        System.out.println("Elements in numberSetB: " + numberSetB.toString());
        numberSetA.union(numberSetB);
        System.out.println("Union of numberSetA and numberSetB: " + numberSetA.toString());  
        System.out.println();  

        // Testing the intersection method
        System.out.println("Testing intersection method:");
        numberSetA = new IntegerSet();  
        numberSetA.add(1);
        numberSetA.add(2);
        numberSetA.add(3);
        System.out.println("Elements in numberSetA: " + numberSetA.toString());
        System.out.println("Elements in numberSetB: " + numberSetB.toString());
        numberSetA.intersect(numberSetB);
        System.out.println("Intersection of numberSetA and numberSetB: " + numberSetA.toString());  
        System.out.println();  

        // Testing the difference method
        System.out.println("Testing difference method:");
        numberSetA = new IntegerSet(); 
        numberSetA.add(1);
        numberSetA.add(2);
        numberSetA.add(3);
        System.out.println("Elements in numberSetA: " + numberSetA.toString());
        System.out.println("Elements in numberSetB: " + numberSetB.toString());
        numberSetA.diff(numberSetB);
        System.out.println("Difference of numberSetA and numberSetB: " + numberSetA.toString()); 
        System.out.println();  

        // Testing complement method
        System.out.println("Testing complement method:");
        numberSetA = new IntegerSet();  
        numberSetA.add(1);
        numberSetA.add(2);
        numberSetA.add(3);
        System.out.println("Elements in numberSetA: " + numberSetA.toString());
        System.out.println("Elements in numberSetB: " + numberSetB.toString());
        numberSetA.complement(numberSetB);
        System.out.println("Complement of numberSetA and numberSetB: " + numberSetA.toString());  
        System.out.println();  

        // Testing isEmpty method
        System.out.println("Testing isEmpty method:");
        System.out.println("Current elements in numberSetA: " + numberSetA.toString());
        System.out.println("numberSetA is empty: " + numberSetA.isEmpty());  
        numberSetA.clear();
        System.out.println("Elements in numberSetA after clearing: " + numberSetA.toString());
        System.out.println("numberSetA is empty after clear: " + numberSetA.isEmpty()); 
        System.out.println();  

        // Testing clear method
        System.out.println("Testing clear method:");
        numberSetA.add(1);
        numberSetA.add(2);
        numberSetA.add(3);
        System.out.println("Elements in numberSetA before clear: " + numberSetA.toString());
        numberSetA.clear();
        System.out.println("Elements in numberSetA after clear: " + numberSetA.toString());  
    }
}
