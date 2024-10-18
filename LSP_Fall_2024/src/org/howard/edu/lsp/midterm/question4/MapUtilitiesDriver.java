package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

public class MapUtilitiesDriver {
    public static void main(String[] args) {
        // Create firstHashMap and add key-value pairs
        HashMap<String, String> firstHashMap = new HashMap<>();
        firstHashMap.put("Alice", "Healthy");
        firstHashMap.put("Mary", "Ecstatic");
        firstHashMap.put("Bob", "Happy");
        firstHashMap.put("Chuck", "Fine");
        firstHashMap.put("Felix", "Sick");

        // Create secondHashMap and add key-value pairs
        HashMap<String, String> secondHashMap = new HashMap<>();
        secondHashMap.put("Mary", "Ecstatic");
        secondHashMap.put("Felix", "Healthy");
        secondHashMap.put("Ricardo", "Superb");
        secondHashMap.put("Tam", "Fine");
        secondHashMap.put("Bob", "Happy");

        // Output the number of common key/value pairs
        System.out.println("Number of common key/value pairs is: " +  
            MapUtilities.commonKeyValuePairs(firstHashMap, secondHashMap));
    }
}
