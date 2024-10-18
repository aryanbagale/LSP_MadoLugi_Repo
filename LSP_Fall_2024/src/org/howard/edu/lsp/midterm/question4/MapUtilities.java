package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

public class MapUtilities {
    // Method to count common key/value pairs between two HashMaps
    public static int commonKeyValuePairs(
        HashMap<String, String> firstMap, HashMap<String, String> secondMap) {

        // Return 0 if either map is empty
        if (firstMap.isEmpty() || secondMap.isEmpty()) {
            return 0;
        }

        int commonPairCount = 0;

        // Iterate through the keys of the first map
        for (String key : firstMap.keySet()) {
            // Check if the key exists in the second map and if the values match
            if (secondMap.containsKey(key) && firstMap.get(key).equals(secondMap.get(key))) {
                commonPairCount++;
            }
        }

        return commonPairCount; // Return the count of common key/value pairs
    }
}
